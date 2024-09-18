# Factory Method Pattern Example

This is a Java project demonstrating the Factory Method pattern by implementing a `ShapeFactory` class that creates different shapes.

## Project Structure

- `src/shapes/Shape.java`: The interface for shapes.
- `src/shapes/Circle.java`, `src/shapes/Rectangle.java`, `src/shapes/Square.java`: Concrete implementations of shapes.
- `src/factory/ShapeFactory.java`: The factory class that creates shapes based on type.
- `src/Main.java`: The main class to demonstrate the use of the factory.

## How to Run

1. **Compile the Java files:**

   ```bash
   javac src/shapes/*.java src/factory/ShapeFactory.java src/Main.java

   ```

2. **Run the main class:**
   ```bash
   java -cp src Main
   ```

You should see messages indicating the drawing of a circle, rectangle, and square.

## How to Set Up the Project

1. **Create the Project Directory:**

   ```bash
   mkdir FactoryMethodExample
   cd FactoryMethodExample

   ```

2. **Create the src Directory:**

   ```bash
   mkdir -p src/shapes src/factory

   ```

3. **Create java files:**

   *Create Shape.java, Circle.java, Rectangle.java, and Square.java in the src/shapes directory.
   *Create ShapeFactory.java in the src/factory directory.
   *Create Main.java in the src directory.
   *Create a README.md file in the root directory with the provided content.

4. **Compile & run:**

   ```bash
    javac src/shapes/*.java src/factory/ShapeFactory.java src/Main.java
    java -cp src Main
   ```

This structure ensures that the project is organized and follows best practices for implementing the Factory Method pattern.
