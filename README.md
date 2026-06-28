# 🔐 Login & Registration App

<div align="center">

<img src="https://img.shields.io/badge/Platform-Android-3DDC84?style=for-the-badge&logo=android"/>
<img src="https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=java"/>
<img src="https://img.shields.io/badge/Database-Firebase-yellow?style=for-the-badge&logo=firebase"/>
<img src="https://img.shields.io/badge/IDE-Android%20Studio-green?style=for-the-badge&logo=androidstudio"/>
<img src="https://img.shields.io/badge/Status-Completed-success?style=for-the-badge"/>
<img src="https://img.shields.io/badge/License-MIT-blue?style=for-the-badge"/>

### Secure Android Authentication System using Firebase

*A modern Android application that demonstrates secure user authentication using Firebase Authentication with a clean Material-inspired interface built in Java.*

---

</div>

## 📖 Overview

This project is a professional Android authentication application developed using **Java** and **Firebase Authentication**.

The application allows users to create an account, securely log in, and manage authentication sessions. It demonstrates real-world Android development concepts including Firebase integration, form validation, activity navigation, and user session management.

This project was created as part of Android development practice while following industry-standard application architecture and coding practices.

---

# ✨ Features

* 🔐 User Registration
* 🔑 Secure Login
* 🚪 Logout Functionality
* ✅ Firebase Email & Password Authentication
* 📧 Email Validation
* 🔒 Password Validation
* ⚡ Fast Authentication
* 🎵 Login Success Sound
* 🎨 Modern UI Design
* 📱 Responsive Layout
* ❌ Error Handling
* 🔄 Persistent Login Session

---

# 🛠 Tech Stack

| Technology              | Purpose                         |
| ----------------------- | ------------------------------- |
| Java                    | Android Application Development |
| Android Studio          | IDE                             |
| Firebase Authentication | User Authentication             |
| XML                     | UI Design                       |
| Gradle                  | Build System                    |
| Git                     | Version Control                 |
| GitHub                  | Source Code Hosting             |

---

# 📂 Project Structure

```text
Login-And-Registration-App
│
├── app/
│   ├── java/
│   │      ├── MainActivity.java
│   │      ├── LoginActivity.java
│   │      ├── RegisterActivity.java
│   │      └── ...
│   │
│   ├── res/
│   │      ├── layout/
│   │      ├── drawable/
│   │      ├── values/
│   │      └── raw/
│   │
│   └── AndroidManifest.xml
│
├── gradle/
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

---

# ⚙️ How It Works

## 1️⃣ User Registration

* User enters:

  * Name
  * Email
  * Password

↓

Application validates the input

↓

Firebase Authentication creates a new account

↓

Account information is securely stored by Firebase

↓

User is redirected to the Login Screen

---

## 2️⃣ User Login

User enters

* Email
* Password

↓

Firebase verifies the credentials

↓

If authentication succeeds

* Login Success Sound plays
* User enters the application

Otherwise

* Appropriate error message is displayed.

---

## 3️⃣ Session Management

Firebase automatically maintains the user's authentication session.

When the user reopens the application:

* Logged in → Directly opens Home Screen
* Logged out → Opens Login Screen

---

## 🔒 Security Features

* Firebase Secure Authentication
* Password Hidden while Typing
* Email Validation
* Empty Field Validation
* Secure Authentication Tokens
* Firebase Managed Sessions
* Authentication Error Handling

---

# 🏭 Industrial Workflow

The authentication process follows the same fundamental flow used in many production Android applications.

```text
User
   │
   ▼
Login Screen
   │
   ▼
Input Validation
   │
   ▼
Firebase Authentication
   │
 ┌─┴──────────────┐
 │                │
 ▼                ▼
Success          Failure
 │                │
 ▼                ▼
Dashboard     Error Message
 │
 ▼
Authenticated Session
```

In larger enterprise systems, this authentication layer typically serves as the gateway before granting access to features such as employee records, inventory management, attendance tracking, or customer dashboards.

---

# 🚀 Installation

### Clone Repository

```bash
git clone https://github.com/vanshmodanwal01/Login-And-Registration-App.git
```

Open Android Studio

```
File
   ↓
Open
   ↓
Select Project
```

Sync Gradle

Run the project on:

* Android Emulator
* Physical Android Device

---

# 🔥 Firebase Configuration

1. Create Firebase Project
2. Enable Email/Password Authentication
3. Download

```
google-services.json
```

4. Place the file inside

```
app/
```

5. Sync Gradle

6. Run Application

---

# 📸 Screenshots

> Add screenshots after uploading them to your repository.

```
screenshots/

login.png

register.png

home.png
```

Example:

```markdown
## Login Screen

![Login](screenshots/login.png)

## Register Screen

![Register](screenshots/register.png)

## Home Screen

![Home](screenshots/home.png)
```

---

# 🎯 Learning Outcomes

This project demonstrates practical experience with:

* Android Activity Lifecycle
* Firebase Authentication
* XML Layout Design
* Java Programming
* Intent Navigation
* User Authentication
* Error Handling
* Android Studio
* Git & GitHub

---

# 🚧 Future Improvements

* Forgot Password
* Email Verification
* Remember Me
* User Profile
* Profile Picture Upload
* Dark Mode
* Password Strength Indicator
* Firebase Firestore Database
* Room Database Support
* Offline Login
* MVVM Architecture
* Material 3 UI
* Push Notifications
* Biometric Authentication
* Google Sign-In

---

# 👨‍💻 Developer

**Vansh Modanwal**

B.Tech CSE (Data Science & AI)

Android Developer • Java Developer • Firebase Enthusiast

GitHub

```
https://github.com/vanshmodanwal01
```

---

# ⭐ Support

If you found this project helpful:

⭐ Star the repository

🍴 Fork the repository

🐞 Report issues

💡 Suggest improvements

---

# 📄 License

This project is licensed under the **MIT License**.

---

<div align="center">

### Thank you for visiting this repository ❤️

**Happy Coding 🚀**

</div>
