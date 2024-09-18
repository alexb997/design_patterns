# Decorator Pattern Example

This project demonstrates the Decorator Pattern by adding features (milk and sugar) to a basic coffee object using decorators.

## Project Structure

- `src/coffee/Coffee.java`: Interface for coffee.
- `src/coffee/BasicCoffee.java`: Concrete implementation of basic coffee.
- `src/coffee/CoffeeDecorator.java`: Abstract decorator class for coffee.
- `src/coffee/MilkDecorator.java`: Concrete decorator for adding milk.
- `src/coffee/SugarDecorator.java`: Concrete decorator for adding sugar.
- `src/Main.java`: Entry point to demonstrate the use of decorators.

## How to Run

1. **Compile the Java files:**

   ```bash
   javac src/coffee/*.java src/Main.java

   ```

2. **Run the main class:**
   ```bash
   java -cp src Main
   ```

You should see output showing the description and cost of different coffee combinations with and without milk and sugar.

## How to Set Up the Project

1. **Create the Project Directory:**

   ```bash
   mkdir DecoratorPatternExample
   cd DecoratorPatternExample

   ```

2. **Create the src Directory:**

   ```bash
   mkdir src/coffee

   ```

3. **Create java files:**

   *Create Coffee.java, BasicCoffee.java, CoffeeDecorator.java, MilkDecorator.java, and SugarDecorator.java in the src/coffee directory.
   *Create Main.java in the src directory.
   *Create a README.md file in the root directory with the provided content.

4. **Compile & run:**

   ```bash
   javac src/coffee/*.java src/Main.java
   java -cp src Main
   ```

This setup shows how to use the Decorator Pattern to dynamically add features to an object, providing a flexible way to enhance its functionality.
