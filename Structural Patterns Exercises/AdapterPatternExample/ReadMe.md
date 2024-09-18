# Adapter Pattern Example

This project demonstrates the Adapter Pattern by allowing an existing `AudioPlayer` to play additional media formats (.mp4 and .vlc) using an adapter.

## Project Structure

- `src/adapter/MediaPlayer.java`: Interface for media players.
- `src/adapter/AudioPlayer.java`: Existing class that plays MP3 files.
- `src/adapter/MediaAdapter.java`: Adapter class to handle additional media formats.
- `src/media/MP4Player.java`: Class to play MP4 files.
- `src/media/VLCPlayer.java`: Class to play VLC files.
- `src/Main.java`: Entry point to demonstrate the use of the adapter.

## How to Run

1. **Compile the Java files:**

   ```bash
   javac src/adapter/*.java src/media/*.java src/Main.java
   ```

2. **Run the main class:**
   ```bash
   java -cp src Main
   ```

You should see output indicating that the AudioPlayer can handle MP3 files directly, while MP4 and VLC files are handled through the adapter.

## How to Set Up the Project

1. **Create the Project Directory:**

   ```bash
   mkdir AdapterPatternExample
   cd AdapterPatternExample

   ```

2. **Create the src Directory:**

   ```bash
   mkdir -p src/adapter src/media

   ```

3. **Create java files:**

   *Create MediaPlayer.java, AudioPlayer.java, and MediaAdapter.java in the src/adapter directory.
   *Create MP4Player.java and VLCPlayer.java in the src/media directory.
   *Create Main.java in the src directory.
   *Create a README.md file in the root directory with the provided content.

4. **Compile & run:**

   ```bash
   javac src/adapter/*.java src/media/*.java src/Main.java
   java -cp src Main
   ```

This setup shows how to use the Adapter Pattern to integrate new functionality with an existing class, providing a consistent interface for clients.
