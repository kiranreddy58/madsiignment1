# Student Profile Android Application

## Overview
This project is a simple Android application designed to display a student's profile information. It serves as an introduction to basic Android development concepts, including UI design using XML, Activity lifecycle management, and event handling.

## Final Output
Below is the final design of the application's user interface, showcasing the clean and modern layout.

![Student Profile Mockup](student_profile_mockup.png)

## What I Have Done

### 1. Project Initialization & Analysis
I started by analyzing the existing project structure. The app is built using **Kotlin** for the backend logic and **XML** for the layout design. I identified the key files responsible for the UI (`activity_main.xml`) and the data (`strings.xml`).

### 2. Updating Student Details
I updated the student's personal information to reflect the correct identity:
- **Name**: kiran reddy
- **Roll Number**: A23126552211

This was done by modifying the `strings.xml` resource file, which is a best practice in Android development to avoid hardcoding text and support future localization.

### 3. UI Design (XML)
The user interface was crafted using a `LinearLayout` with a vertical orientation. Key components include:
- **ImageView**: Displays a profile picture (placeholder used).
- **TextViews**: Used for displaying the Name, Roll Number, Course, and Email with customized text sizes and styles for better readability.
- **Button**: A stylized "Show Details" button with a purple background.

### 4. Logic Implementation (MainActivity.kt)
In the `MainActivity.kt` file, I implemented the following logic:
- Connected the UI components using `findViewById`.
- Added a **Click Listener** to the "Show Details" button.
- Configured a **Toast message** to appear when the button is clicked, providing immediate feedback to the user.

## How I Did It
1.  **Resource Management**: Instead of putting text directly in the layout, I used `res/values/strings.xml` and `res/values/colors.xml`. This makes the app easier to maintain.
2.  **Layout Hierarchy**: I used a simple `LinearLayout` to stack elements vertically and centered them using `android:gravity="center_horizontal"`.
3.  **Kotlin Logic**: I overrode the `onCreate` method to set up the view and initialize the interactive elements. The use of `val` for button initialization and `setOnClickListener` lambda follows modern Kotlin conventions for Android.

## Conclusion
This project demonstrates the core fundamentals of Android app development, focusing on the separation of concerns between design (XML) and logic (Kotlin).
