# Adapter Pattern Example

This project demonstrates the **Adapter Pattern** by allowing an `AudioPlayer` to play various media formats (`mp3`, `mp4`, `vlc`, and `wav`), with additional support for error handling and logging.

## New Features

1. **Support for .wav Format**: The adapter now supports `.wav` files in addition to `.mp4` and `.vlc`.
2. **Error Handling**: Unsupported formats (e.g., `.avi`) will return an error message: "Unsupported format: .avi".
3. **Logging**: Every media file played is logged, including the file name and format.

## Project Structure

- `src/adapter/MediaPlayer.java`: Interface for playing media files.
- `src/adapter/AdvancedMediaPlayer.java`: Interface for more advanced media players.
- `src/adapter/Mp4Player.java`: Class for playing `.mp4` files.
- `src/adapter/VlcPlayer.java`: Class for playing `.vlc` files.
- `src/adapter/WavPlayer.java`: Class for playing `.wav` files.
- `src/adapter/MediaAdapter.java`: Adapter that allows `AudioPlayer` to play `.mp4`, `.vlc`, and `.wav`.
- `src/adapter/AudioPlayer.java`: Main class that plays `.mp3` directly and uses the adapter for other formats.
- `src/Main.java`: Demonstrates how to use the `AudioPlayer` and adapter.

## How to Run

1. **Compile the Java files:**

   ```bash
   javac src/adapter/*.java src/Main.java

   ```

2. **Run the main class:**
   ```bash
   java -cp src Main
   ```

## Input Parameters/Steps

1.  Play an .mp3 file using AudioPlayer.
2.  Use the Adapter to play an .mp4 file.
3.  Use the Adapter to play a .vlc file.
4.  Try playing an unsupported format like .avi.
5.  Log every media file played, including file name and format.

## Expected Results

- Step 1: The .mp3 file plays successfully.
- Step 2: The .mp4 file plays using the adapter.
- Step 3: The .vlc file plays using the adapter.
- Step 4: An error message "Unsupported format: .avi" is displayed when attempting to play the .avi file.
- Step 5: Each media file played is logged, including the file name and format.

## Example Output

```bash
Playing mp3 file. Name: song.mp3
Playing mp4 file. Name: movie.mp4
Playing vlc file. Name: video.vlc
Unsupported format: avi
```

## How to Set Up the Project

1. **Create the Project Directory:**

   ```bash
   mkdir AdapterPatternExample
   cd AdapterPatternExample

   ```

2. **Create the src Directory:**

   ```bash
   mkdir src
   mkdir src/adapters

   ```

3. **Create java files:**

   \*Place the .java files in the src/adapters/ directory as shown in the structure above

4. **Compile & run:**

   ```bash
   javac src/adapters/*.java src/Main.java
   java -cp src Main
   ```

This setup demonstrates how to use the Adapter Pattern to manage various media formats, handle unsupported formats gracefully, and log actions performed by the adapter.
