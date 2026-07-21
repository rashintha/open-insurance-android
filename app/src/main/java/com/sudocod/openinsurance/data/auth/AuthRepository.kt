package com.sudocod.openinsurance.data.auth

import com.sudocod.openinsurance.data.network.ApiClient
import kotlinx.serialization.json.Json
import retrofit2.HttpException
import java.io.IOException

sealed class AuthResult {
    data class Success(val response: LoginResponse) : AuthResult()
    data class Failure(val message: String) : AuthResult()
}

class AuthRepository(
    private val api: AuthApi = ApiClient.authApi,
) {
    private val json = Json { ignoreUnknownKeys = true }

    suspend fun login(email: String, password: String): AuthResult {
        return try {
            val response = api.login(LoginRequest(email = email.trim(), password = password))
            if (response.isSuccessful) {
                val body = response.body()
                if (body != null) {
                    AuthResult.Success(body)
                } else {
                    AuthResult.Failure("Empty response from server")
                }
            } else {
                val errorMessage = parseError(response.errorBody()?.string())
                    ?: when (response.code()) {
                        401 -> "invalid credentials"
                        400 -> "invalid request"
                        else -> "Request failed (${response.code()})"
                    }
                AuthResult.Failure(errorMessage)
            }
        } catch (_: IOException) {
            AuthResult.Failure(NETWORK_ERROR)
        } catch (e: HttpException) {
            AuthResult.Failure(parseError(e.response()?.errorBody()?.string()) ?: e.message())
        } catch (e: Exception) {
            AuthResult.Failure(e.message ?: "Unexpected error")
        }
    }

    private fun parseError(raw: String?): String? {
        if (raw.isNullOrBlank()) return null
        return try {
            json.decodeFromString<ErrorResponse>(raw).error
        } catch (_: Exception) {
            null
        }
    }

    companion object {
        const val NETWORK_ERROR = "NETWORK_ERROR"
    }
}
