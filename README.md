# Open Insurance Android

Android client for Open Insurance, built with Jetpack Compose and Material 3.

![Kotlin](https://img.shields.io/badge/2.2.10-badge?style=for-the-badge&logo=kotlin&logoColor=%237F52FF&label=Kotlin&labelColor=gray&color=%237F52FF)
![Android](https://img.shields.io/badge/API_26+-badge?style=for-the-badge&logo=android&logoColor=%233DDC84&label=Android&labelColor=gray&color=%233DDC84)
![Jetpack Compose](https://img.shields.io/badge/Jetpack_Compose-badge?style=for-the-badge&logo=jetpackcompose&logoColor=%234285F4&label=Jetpack%20Compose&labelColor=gray&color=%234285F4)
![Material 3](https://img.shields.io/badge/Material_3-badge?style=for-the-badge&logo=materialdesign&logoColor=%237675FF&label=Material%203&labelColor=gray&color=%237675FF)
![Gradle](https://img.shields.io/badge/9.5.0-badge?style=for-the-badge&logo=gradle&logoColor=%2302303A&label=Gradle&labelColor=gray&color=%2302303A)
![License](https://img.shields.io/badge/Apache_2.0-badge?style=for-the-badge&logo=apache&logoColor=%23D22128&label=License&labelColor=gray&color=%23D22128)

## Features

- Material 3 theming with light/dark mode support
- Material You dynamic colors on Android 12+
- Edge-to-edge layout with system bar integration
- Modern declarative UI with Jetpack Compose

## Requirements

- Android Studio Ladybug or newer
- JDK 11+
- Android SDK 36
- Minimum device API level: 26

## Getting Started

Clone the repository and open the project in Android Studio.

```bash
git clone https://github.com/SudoCod/open-insurance-android.git
cd open-insurance-android
```

Build a debug APK from the command line:

```bash
./gradlew assembleDebug
```

Install and run on a connected device or emulator:

```bash
./gradlew installDebug
```

## Project Structure

```
app/
├── src/main/java/com/sudocod/openinsurance/
│   ├── MainActivity.kt
│   └── ui/theme/          # Material 3 color schemes, typography, theme
└── src/main/res/
    ├── values/            # Light theme colors and XML theme
    └── values-night/      # Dark theme colors
```

## Tech Stack

| Technology | Version |
| --- | --- |
| Kotlin | 2.2.10 |
| Android Gradle Plugin | 9.3.0 |
| Compose BOM | 2026.02.01 |
| Material Components | 1.12.0 |
| Min SDK | 26 |
| Target SDK | 36 |

## Contributing

Contributions are welcome. Please read [CONTRIBUTING.md](CONTRIBUTING.md) before opening a pull request.

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/my-change`)
3. Commit your changes with a clear message
4. Push to your fork and open a pull request

## License

This project is licensed under the Apache License 2.0. See [LICENSE](LICENSE) for the full text.

## Contributors

<a href="https://github.com/SudoCod/open-insurance-android/graphs/contributors">
  <img src="https://contrib.rocks/image?repo=SudoCod/open-insurance-android" alt="Contributors"/>
</a>

Made with [contrib.rocks](https://contrib.rocks).
