# F-Droid App Testing Automation

## Description
This project automates the testing of the F-Droid app, an open-source application marketplace for Android, using WebdriverIO and Appium. The primary objective is to ensure the app functions correctly across various interactions and features. The automation scripts are written in Java and leverage the Appium framework to simulate user actions on an Android device.

## Tools & Technologies
- **Testing Framework**: WebdriverIO
- **Automation Framework**: Appium
- **Programming Language**: Java
- **Mobile Platform**: Android
- **Appium Inspector**: Utilized for locating UI elements in the F-Droid app.

## Features
- **Launch the F-Droid App**: Tests the app's launch and verifies the accessibility of key UI elements.
- **User Interaction Automation**:
  - Clicks on various icons such as "Nearby," "Settings," and "Categories."
  - Navigates to the "Theme" setting and switches to "Dark" mode.
- **Notification Management**:
  - Opens the notification panel.
  - Interacts with notifications by selecting options like "Do Not Disturb."
- **App Switching**: 
  - Switches to the General Store app and retrieves messages, demonstrating the ability to handle multiple apps.
  - Uses the app switcher to return to previous applications and interacts with UI elements like the search bar.

## Test Cases
1. **Test Case 1: Launch and Navigate within F-Droid**
   - Launch the app.
   - Navigate to "Settings" and change the theme.
   - Access "Categories."

2. **Test Case 2: Open and Manage Notifications**
   - Open notifications.
   - Click on the "Do Not Disturb" option.

3. **Test Case 3: App Switching and Interaction**
   - Switch to the General Store app.
   - Retrieve and display a message from the General Store.
   - Switch back to the F-Droid app and perform a search.

## Conclusion
This project exemplifies the use of WebdriverIO and Appium for automating mobile app testing, focusing on user interface interactions and application behavior within the F-Droid app. It serves as a foundation for further enhancements and comprehensive testing strategies for Android applications.
---
