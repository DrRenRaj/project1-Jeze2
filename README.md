# Task Manager App

## Overview

The Task Manager App is designed for students and professionals to efficiently organize tasks and manage schedules. It provides a user-friendly interface for tracking daily activities, setting reminders, and managing deadlines.

## Features

- **Task Creation:** Easily create and manage tasks with deadlines.
- **Reminders:** Set reminders for upcoming tasks.
- **Profile Management:** Manage user profile information.
- **Settings:** Customize app preferences.
- **Navigation:** Bottom navigation for quick access to Home, Tasks, Profile, and Settings.

## Design Choices

- **Activities and Fragments:**
    - Multiple activities and fragments are used to separate different functionalities, simplifying the codebase and improving maintainability.
    - Each fragment handles a specific task, making the app modular and easier to manage.
    - The main activity supports larger screens with a two-pane layout, enhancing usability on tablets.

## Navigation Choices

- **Bottom Navigation:**
    - Provides easy access to the main sections of the app.
- **Jetpack Navigation:**
    - Manages fragment transitions smoothly, ensuring a seamless user experience.

## Challenges and Solutions

- **Fragment Transactions:**
    - Challenge: Managing fragment transactions and ensuring smooth navigation.
    - Solution: Thoroughly learning Jetpack Navigation and following best practices. Resources like Stack Overflow and the official Android documentation were invaluable.

## Key Learnings

- **Android Development:**
    - Deepened understanding of designing user interfaces with fragments and handling navigation.
    - Learned how to structure an app to be scalable and maintainable.

## Future Improvements

- **Cloud Synchronization:**
    - Add features like synchronization with cloud services for task backup and sharing.
- **Customization Options:**
    - Provide more customization options for users, enhancing the app's functionality and user experience.


