# Facade Pattern Example

This project demonstrates the Facade Pattern by creating a `HomeTheaterFacade` class to simplify the use of a home theater system with various subsystems.

## Project Structure

- `src/subsystem/DVDPlayer.java`: Class for DVD player subsystem.
- `src/subsystem/Projector.java`: Class for projector subsystem.
- `src/subsystem/SoundSystem.java`: Class for sound system subsystem.
- `src/facade/HomeTheaterFacade.java`: Facade class to simplify interaction with subsystems.
- `src/Main.java`: Entry point to demonstrate the use of the facade.

## How to Run

1. **Compile the Java files:**

   ```bash
   javac src/subsystem/*.java src/facade/HomeTheaterFacade.java src/Main.java
   ```

2. **Run the main class:**
   ```bash
   java -cp src Main
   ```

You should see output demonstrating the sequence of operations for watching and stopping a movie using the home theater system.

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

   *Create DVDPlayer.java, Projector.java, and SoundSystem.java in the src/subsystem directory.
   *Create HomeTheaterFacade.java in the src/facade directory.
   *Create Main.java in the src directory.
   *Create a README.md file in the root directory with the provided content.

4. **Compile & run:**

   ```bash
   javac src/subsystem/*.java src/facade/HomeTheaterFacade.java src/Main.java
   java -cp src Main
   ```

This setup demonstrates how to use the Facade Pattern to provide a simple interface for interacting with complex subsystems, making it easier to manage and use them.
