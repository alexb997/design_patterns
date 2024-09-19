# Facade Pattern Example

This project demonstrates the **Facade Pattern** by simplifying the control of a home theater system with various subsystems using a `HomeTheaterFacade` class.

## Project Structure

- `src/subsystem/DVDPlayer.java`: Class for the DVD player subsystem, includes error simulation.
- `src/subsystem/Projector.java`: Class for the projector subsystem.
- `src/subsystem/SoundSystem.java`: Class for the sound system, includes volume control.
- `src/subsystem/LightingSystem.java`: Class for controlling lighting (dim or bright lights).
- `src/facade/HomeTheaterFacade.java`: Facade class to simplify interaction with the subsystems and handle errors.
- `src/Main.java`: Entry point demonstrating various modes, volume control, and error handling.

## How to Run

1. **Compile the Java files:**

   ```bash
   javac src/subsystem/*.java src/facade/HomeTheaterFacade.java src/Main.java
   ```

2. **Run the main class:**
   ```bash
   java -cp src Main
   ```

You should see output similar to the following, demonstrating various modes and volume control:

```bash
Preparing to watch movie...
DVD Player is on.
Projector is on.
Sound system is on.
Lights are dimmed for the movie.
Playing movie: Inception
Volume set to: 75
Shutting down the movie...
DVD Player is off.
Projector is off.
Sound system is off.
Lights are bright.
Preparing to play music...
Sound system is on.
Lights are bright.
Music is playing.
Preparing for gaming mode...
Projector is on.
Sound system is on.
Lights are bright.
Gaming mode activated.
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
