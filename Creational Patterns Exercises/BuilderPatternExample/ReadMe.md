# Builder Pattern Example

This project demonstrates the Builder Pattern by implementing a `ComputerBuilder` class to construct `Computer` objects with optional components.

## Project Structure

- `src/product/Computer.java`: Contains the `Computer` class with a nested `Builder` class.
- `src/builder/ComputerBuilder.java`: Demonstrates the use of the `Computer` builder to create different `Computer` configurations.
- `src/Main.java`: Entry point to run the `ComputerBuilder` example.

## How to Run

1. **Compile the Java files:**

   ```bash
   javac src/product/Computer.java src/builder/ComputerBuilder.java src/Main.java
   ```

2. **Run the main class:**
   ```bash
   java -cp src Main
   ```

You should see output displaying the details of different computer configurations created using the builder pattern.

## How to Set Up the Project

1. **Create the Project Directory:**

   ```bash
   mkdir BuilderPatternExample
   cd BuilderPatternExample

   ```

2. **Create the src Directory:**

   ```bash
   mkdir -p src/product src/builder

   ```

3. **Create java files:**

   *Create Computer.java in the src/product directory.
   *Create ComputerBuilder.java in the src/builder directory.
   *Create Main.java in the src directory.
   *Create a README.md file in the root directory with the provided content.

4. **Compile & run:**

   ```bash
   javac src/product/Computer.java src/builder/ComputerBuilder.java src/Main.java
   java -cp src Main
   ```

This setup demonstrates how to use the Builder Pattern to create complex objects with optional components, allowing for flexible and readable object creation.
