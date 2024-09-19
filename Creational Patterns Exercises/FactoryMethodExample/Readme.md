# Factory Method Pattern Example

This project demonstrates the **Factory Method Pattern** by creating various shapes (Circle, Square, Rectangle) using a factory class.

## Project Structure

- `src/shapes/Shape.java`: Interface for all shapes with methods for area and perimeter calculation.
- `src/shapes/Circle.java`: Concrete implementation of a circle.
- `src/shapes/Square.java`: Concrete implementation of a square.
- `src/shapes/Rectangle.java`: Concrete implementation of a rectangle.
- `src/factory/ShapeFactory.java`: Factory class that creates shapes and manages caching.
- `src/Main.java`: Entry point to demonstrate shape creation, caching, and usage.

## How to Run

1. **Compile the Java files:**

   ```bash
   javac src/shapes/*.java src/factory/ShapeFactory.java src/Main.java

   ```

2. **Run the main class:**
   ```bash
   java -cp src Main
   ```

You should see output demonstrating the creation of shapes with specific and default dimensions, calculation of their areas and perimeters, and caching of shapes.

## How to Set Up the Project

1. **Create the Project Directory:**

   ```bash
   mkdir FactoryMethodExample
   cd FactoryMethodExample

   ```

2. **Create the src Directory:**

   ```bash
   mkdir src/shapes
   mkdir src/factory

   ```

3. **Create java files:**

   *Create Shape.java, Circle.java, Rectangle.java, and Square.java in the src/shapes directory.
   *Create ShapeFactory.java in the src/factory directory.
   \*Create Main.java in the src directory.

4. **Compile & run:**

   ```bash
    javac src/shapes/*.java src/factory/ShapeFactory.java src/Main.java
    java -cp src Main
   ```

This setup demonstrates how to use the Factory Method Pattern to create shapes with various features and caching.
