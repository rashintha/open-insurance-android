# Contributing to Open Insurance Android

Thank you for your interest in contributing. This document outlines how to get started and what we expect from contributions.

## Code of Conduct

Be respectful and constructive. Focus on the work, keep discussions professional, and help maintain a welcoming environment for everyone.

## How to Contribute

### Reporting Issues

Before opening a new issue, search existing issues to avoid duplicates. When filing a bug report, include:

- A clear description of the problem
- Steps to reproduce
- Expected vs. actual behavior
- Device/emulator details (API level, manufacturer if relevant)
- Screenshots or logs when helpful

### Pull Requests

1. Fork the repository and create a branch from `main`
2. Make focused changes with clear commit messages
3. Follow existing code style and project conventions
4. Test your changes locally (`./gradlew assembleDebug`)
5. Open a pull request describing what changed and why

### Development Setup

1. Install Android Studio and the required SDK platforms
2. Clone your fork and open the project
3. Sync Gradle and run the app on an emulator or device

### Commit Messages

Write concise, descriptive commit messages. Prefer the imperative mood:

- `Add policy details screen`
- `Fix dark theme status bar contrast`
- `Update Compose BOM to 2026.02.01`

### Scope

Keep pull requests focused. Smaller, reviewable changes are easier to merge than large refactors that mix unrelated updates.

## License

By contributing, you agree that your contributions will be licensed under the [Apache License 2.0](LICENSE).
