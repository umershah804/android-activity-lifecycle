# android-activity-lifecycle
Android Activity Lifecycle Assignment

# Android Activity Lifecycle Demo

## Overview
This project demonstrates the Android Activity Lifecycle using Java and XML.

## Objectives
- Understand the different lifecycle stages of an Activity.
- Learn how Android manages activities.
- Navigate from one activity to another.
- Observe lifecycle messages using Logcat.

## Lifecycle Callback Methods

**onCreate():** Initializes the activity.

**onStart():** Makes the activity visible.

**onResume():** Allows the user to interact with the activity.

**onPause():** Called when the activity loses foreground focus.

**onStop():** Called when the activity is no longer visible.

**onRestart():** Called when a stopped activity starts again.

**onDestroy():** Called before the activity is destroyed.

## Project Files
- AndroidManifest.xml
- MainActivity.java
- SecondActivity.java
- activity_main.xml
- activity_second.xml

## Technologies
- Java
- XML
- Android SDK

## Working
The main screen contains a button that opens the second activity.
Lifecycle callback messages are logged using Android's Log class.

## Conclusion
This demonstration helps explain how Android activities move through
their lifecycle states during navigation and interaction.

