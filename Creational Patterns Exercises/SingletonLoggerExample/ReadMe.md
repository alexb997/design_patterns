# Singleton Pattern Enhanced Example

This project demonstrates the Singleton Pattern by creating a `Logger` class that logs messages to the console and/or a file. The logger can dynamically switch between logging modes and provides an option to clear the logs. Each log entry is timestamped.

## Project Structure

- `src/logger/Logger.java`: Implements the enhanced `Logger` with console and file logging, log clearing, and timestamping.
- `src/Main.java`: Demonstrates the usage of the enhanced `Logger`.

## New Features

1. **Log Modes**: You can log to the console, a file, or both.
2. **Clear Logs**: The logs can be cleared (file logs will be cleared, console logs cannot be).
3. **Timestamps**: Each log entry is timestamped with the current date and time.

## How to Run

1. **Compile the Java files:**

   ```bash
   javac src/logger/Logger.java src/Main.java

   ```

2. **Run the main class:**
   ```bash
   java -cp src Main
   ```

You should see the log messages printed to the console, and a confirmation that both logger instances are the same.

## How to Set Up the Project

1. **Create the Project Directory:**

   ```bash
   mkdir SingletonPatternEnhanced
   cd SingletonPatternEnhanced

   ```

2. **Create the src Directory:**

   ```bash
   mkdir src/logger

   ```

3. **Create java files:**

   *Create Logger.java in the src/logger directory.
   *Create Main.java in the src directory.
   \*Create a README.md file in the root directory with the provided content.

4. **Compile & run:**

   ```bash
   javac src/logger/Logger.java src/Main.java
   java -cp src Main
   ```

This updated setup enhances the Singleton Pattern by adding multiple log modes (console, file, or both), the ability to clear logs from the file, and a timestamp for each log entry.
