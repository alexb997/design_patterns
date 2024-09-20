# Factory Method Pattern Example

This project demonstrates the **Factory Method Pattern** for creating different shapes (e.g., Circle, Square). It includes new features like default dimensions, calculating perimeter, and caching of shapes.

## New Features

1. **Perimeter Calculation**: Each shape (Circle, Square) now includes a method to calculate the perimeter in addition to the area.
2. **Default Dimensions**: If no dimensions are provided, default values are used (e.g., default radius for Circle, default side length for Square).
3. **Shape Caching**: The factory caches the last five created shapes and can return them without recreating them.

## Project Structure

- `src/shape/Shape.java`: Abstract class representing a general shape.
- `src/shape/Circle.java`: Concrete Circle class with methods to calculate area and perimeter.
- `src/shape/Square.java`: Concrete Square class with methods to calculate area and perimeter.
- `src/shape/Rectangle.java`: Concrete Square class with methods to calculate area and perimeter.
- `src/factory/ShapeFactory.java`: Factory class responsible for creating shapes.
- `src/factory/InvalidShapeException.java`: Custom exception for unsupported shapes.
- `src/Main.java`: Demonstrates how to use the factory to create shapes.

## How to Run

1. **Compile the Java files:**

   ```bash
   javac src/factory/*.java src/shape/*.java src/Main.java

   ```

2. **Run the main class:**
   ```bash
   java -cp src Main
   ```

## Input Parameters/Steps

- Call ShapeFactory.createShape("Circle") with a radius of 5.
- Call ShapeFactory.createShape("Square") with a side length of 4.
- Call ShapeFactory.createShape("Rectangle") with a length of 6 and a width of 3.
- Call ShapeFactory.createShape("Triangle") (which is unsupported).
- For each shape, call calculateArea() and calculatePerimeter().
- Create shapes without providing dimensions and use default values.

## Expected Results

- Step 1: Circle with radius 5 is created and both area and perimeter are calculated.
- Step 2: Square with side length 4 is created and both area and perimeter are calculated.
- Step 3: Rectangle with length 6 and width 3 is created and both area and perimeter are calculated.
- Step 4: An InvalidShapeException is thrown for unsupported shapes like Triangle.
- Step 5: Shapes created without dimensions use default sizes (e.g., Circle with default radius).
- Step 6: Cached shapes are printed to the console.

## Example Output

```bash
Circle (Radius: 5.00) Area: 78.54 Perimeter: 31.42
Square (Side: 4.00) Area: 16.00 Perimeter: 16.00
Rectangle (Length: 6.00, Width: 3.00) Area: 18.00 Perimeter: 18.00
Unsupported shape type: Triangle
Circle (Radius: 1.00) Area: 3.14 Perimeter: 6.28
Square (Side: 1.00) Area: 1.00 Perimeter: 4.00
Rectangle (Length: 2.00, Width: 1.00) Area: 2.00 Perimeter: 6.00
Cached Shapes:
Circle (Radius: 5.00)
Square (Side: 4.00)
Rectangle (Length: 6.00, Width: 3.00)
Circle (Radius: 1.00)
Square (Side: 1.00)
```

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

   - Create Shape.java, Circle.java, Rectangle.java and Square.java in the src/shapes directory.
   - Create ShapeFactory.java and InvalidShapeException.java in the src/factory directory.
   - Create Main.java in the src directory.

4. **Compile & run:**

   ```bash
    javac src/shapes/*.java src/factory/*.java src/Main.java
   java -cp src Main
   ```

This setup demonstrates how the Factory Method Pattern can be used to create objects dynamically and implement additional features like default dimensions and caching.
