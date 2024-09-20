# Singleton Logger Example

This project demonstrates the **Singleton** pattern by implementing a Logger class that manages logging to both the console and a file.

## New Features

1. **Singleton Pattern**: The logger ensures only one instance exists.
2. **Log Levels**: Logs are filtered by level (INFO, DEBUG, ERROR), and you can set the minimum log level.
3. **Console & File Logging**: The logger can print logs to both the console and a file.
4. **Log Count**: Tracks the number of logs written.
5. **Clearing Logs**: Clears the log file and resets the log count.
6. **Timestamps**: Every log entry is timestamped.

## Project Structure

- `src/logger/Logger.java`: Contains the Logger class, implementing the Singleton pattern.
- `src/Main.java`: Demonstrates the usage of the logger.
- `logs/app.log`: File where logs are stored when file logging is enabled.

## How to Run

1. **Compile the Java files:**

   ```bash
   javac src/logger/Logger.java src/Main.java
   ```

2. **Run the main class:**
   ```bash
   java -cp src Main
   ```

## Input Parameters/Steps

1.  Call Logger.getInstance() to obtain the logger instance.
2.  Set the log level to INFO.
3.  Log messages with different levels: INFO, DEBUG, and ERROR.
4.  Change the logging mode to "console and file".
5.  Log a message.
6.  Clear the logs.
7.  Log a message with a timestamp.

## Expected Results

- Only messages of INFO or higher level are printed (DEBUG messages are ignored).
- Logs are printed to both the console and the file (logs/app.log).
- Log count is incremented after each log entry.
- After clearing the logs, the log file is empty, and the count is reset.
- Each log message contains a timestamp.

## Example Output

```bash
[2024-09-19 14:22:13] INFO: This is an INFO message.
[2024-09-19 14:22:13] ERROR: This is an ERROR message.
[2024-09-19 14:22:13] INFO: Logging to both console and file.
Logs cleared.
[2024-09-19 14:22:13] INFO: Logging after clearing logs, with a timestamp.
```

## How to Set Up the Project

1. **Create the Project Directory:**

   ```bash
   mkdir SingletonPatternEnhanced
   cd SingletonPatternEnhanced

   ```

2. **Create the src Directory:**

   ```bash
   mkdir src/logger
   mkdir logs
   ```

3. **Create java files:**

   - Create Logger.java in the src/logger directory.
   - Create Main.java in the src directory.

4. **Compile & run:**

   ```bash
   javac src/logger/Logger.java src/Main.java
   java -cp src Main
   ```

This setup demonstrates how the Singleton Pattern can be used to implement a logging system with different log levels, file logging, and other useful features like log clearing and timestamping.
