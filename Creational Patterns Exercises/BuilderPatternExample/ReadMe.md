# Builder Pattern Example

This project demonstrates the **Builder Pattern** by constructing `Computer` objects with various attributes including CPU, RAM, Storage, Graphics Card, and Cooling System.

## Project Structure

- `src/computer/Computer.java`: Contains the `Computer` class and its builder.
- `src/computer/CoolingSystem.java`: Abstract class for cooling systems.
- `src/computer/AirCooling.java`: Concrete implementation of air cooling.
- `src/computer/LiquidCooling.java`: Concrete implementation of liquid cooling.
- `src/computer/ComputerBuilder.java`: Builder class to construct computers and handle bulk creation.
- `src/Main.java`: Entry point to demonstrate the building of individual and bulk computers.

## How to Run

1. **Compile the Java files:**

   ```bash
   javac src/computer/*.java src/Main.java
   ```

2. **Run the main class:**
   ```bash
   java -cp src Main
   ```

You should see output demonstrating the construction of individual computers with various configurations, including cooling systems, and the bulk creation of multiple computers.

## How to Set Up the Project

1. **Create the Project Directory:**

   ```bash
   mkdir BuilderPatternExample
   cd BuilderPatternExample

   ```

2. **Create the src Directory:**

   ```bash
   mkdir src
   mkdir src/computer

   ```

3. **Create java files:**

   *Create Computer.java, CoolingSystem.java, AirCooling.java, LiquidCooling.java, and ComputerBuilder.java in the src/computer directory.
   *Create Main.java in the src directory.

4. **Compile & run:**

   ```bash
   javac src/computer/*.java src/Main.java
   java -cp src Main
   ```

This setup demonstrates how to use the Builder Pattern to construct complex objects with various configurations and handle bulk creation.
