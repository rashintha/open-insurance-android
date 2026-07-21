package com.sudocod.openinsurance.data.auth

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthApi {
    @POST("identity/auth/login")
    suspend fun login(@Body request: LoginRequest): Response<LoginResponse>
}
