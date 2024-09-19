# Adapter Pattern Example

This project demonstrates the **Adapter Pattern** by creating a `MediaAdapter` that allows a `MediaPlayer` to handle various media formats, including `.mp3`, `.mp4`, `.vlc`, and `.wav`. The adapter also provides logging and error handling for unsupported formats.

## Project Structure

- `src/adapter/MediaPlayer.java`: Interface for media players.
- `src/adapter/Mp3Player.java`: Concrete implementation for `.mp3` files.
- `src/adapter/MediaAdapter.java`: Adapter class to handle various media formats and log activities.
- `src/log/Logger.java`: Logger class to handle logging of media activities.
- `src/Main.java`: Entry point to demonstrate playing different media formats.

## How to Run

1. **Compile the Java files:**

   ```bash
   javac src/adapter/*.java src/log/Logger.java src/Main.java

   ```

2. **Run the main class:**
   ```bash
   java -cp src Main
   ```

You should see output demonstrating the playback of various media files and logging of these actions.

## How to Set Up the Project

1. **Create the Project Directory:**

   ```bash
   mkdir AdapterPatternExample
   cd AdapterPatternExample

   ```

2. **Create the src Directory:**

   ```bash
   mkdir src
   mkdir src/adapter
   mkdir src/log

   ```

3. **Create java files:**

   *Create MediaPlayer.java, Mp3Player.java, and MediaAdapter.java in the src/adapter directory.
   *Create Logger.java in the src/log directory.
   \*Create Main.java in the src directory.

4. **Compile & run:**

   ```bash
   javac src/adapter/*.java src/log/Logger.java src/Main.java
   java -cp src Main
   ```

This setup demonstrates how to use the Adapter Pattern to manage various media formats, handle unsupported formats gracefully, and log actions performed by the adapter.
