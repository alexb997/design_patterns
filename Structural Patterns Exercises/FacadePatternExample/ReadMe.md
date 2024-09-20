# Facade Pattern Example

This project demonstrates the **Facade Pattern** by creating a `HomeTheaterFacade` class to manage a home theater system consisting of subsystems like DVD Player, Projector, Sound System, and a new Lighting System.

## New Features

1. **Different Modes**: The facade supports switching between different modes:
   - `watchMovie()`: Turns on the DVD player, projector, sound system, and dims the lights.
   - `playMusic()`: Only starts the sound system and brightens the lights.
   - `gamingMode()`: Starts the projector and sound system, and brightens the lights.
2. **Volume Control**: The `volumeControl()` method allows adjusting the sound system volume directly.
3. **Error Handling**: If a subsystem (e.g., DVD Player) fails, the system logs the error and attempts to recover gracefully.

## Project Structure

- `src/subsystem/`: Contains the individual components (DVDPlayer, Projector, SoundSystem, LightingSystem).
- `src/facade/`: Contains the `HomeTheaterFacade` class that simplifies the usage of the subsystems.
- `src/Main.java`: Demonstrates how to use the `HomeTheaterFacade` class.

## How to Run

1. **Compile the Java files**:

   ```bash
   javac src/subsystem/*.java src/facade/HomeTheaterFacade.java src/Main.java
   ```

2. **Run the main class:**

   ```bash
   java -cp src Main
   ```

## Input Parameters/Steps

   - Call watchMovie() to start the home theater system.
   - Call stopMovie() to stop the system.
   - Switch to playMusic() mode.
   - Use volumeControl() to adjust the sound.
   - Call watchMovie() when the DVDPlayer subsystem fails.

## Expected Results
   - The watchMovie() mode turns on the DVD player, projector, sound system, and dims the lights.
   - The playMusic() mode only starts the sound system and brightens the lights.
   - The volume is adjusted correctly using volumeControl().
   - When the DVDPlayer fails, an error is logged, and the system gracefully handles the failure.

## Example Output:
```bash
Setting up to watch a movie...
DVD Player is on.
Projector is on.
Projector input set to DVD
Sound system is on.
Lights are dimmed.
Playing movie: Inception
Enjoy your movie!

Shutting down movie mode...
DVD Player is off.
Projector is off.
Sound system is off.
Lights are brightened.

Switching to music mode...
Sound system is on.
Playing music: Classical Symphony
Lights are brightened.

Sound system volume set to 8

Setting up to watch a movie...
Error: DVD Player failed. DVD Player is not on.
```

## How to Set Up the Project

1. **Create the Project Directory:**

   ```bash
   mkdir FacadePatternExample
   cd FacadePatternExample

   ```

2. **Create the src Directory:**

   ```bash
   mkdir src/subsystem
   mkdir src/facade

   ```

3. **Create java files:**

   *Create DVDPlayer.java, Projector.java, SoundSystem.java, and LightingSystem.java in the src/subsystem directory.
   *Create HomeTheaterFacade.java in the src/facade directory.
   \*Create Main.java in the src directory.

4. **Compile & run:**

   ```bash
   javac src/subsystem/*.java src/facade/HomeTheaterFacade.java src/Main.java
   java -cp src Main
   ```

This setup demonstrates how the Facade Pattern simplifies control of multiple subsystems with additional features like mode switching, volume control, and error handling.
