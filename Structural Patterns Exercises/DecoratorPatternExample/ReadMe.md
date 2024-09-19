# Decorator Pattern Example

This project demonstrates the **Decorator Pattern** by creating a `Coffee` class and dynamically adding features to it through decorators.

## Project Structure

- `src/coffee/Coffee.java`: Interface for a coffee class.
- `src/coffee/BasicCoffee.java`: Concrete implementation of basic coffee.
- `src/decorators/CoffeeDecorator.java`: Abstract decorator class to extend coffee functionality.
- `src/decorators/MilkDecorator.java`: Adds milk to coffee.
- `src/decorators/SugarDecorator.java`: Adds sugar to coffee.
- `src/decorators/WhippedCreamDecorator.java`: Adds whipped cream to coffee.
- `src/Main.java`: Entry point to demonstrate how decorators can be applied to the coffee object.

## How to Run

1. **Compile the Java files:**

   ```bash
   javac src/coffee/*.java src/decorators/*.java src/Main.java

   ```

2. **Run the main class:**
   ```bash
   java -cp src Main
   ```

You should see output similar to the following, demonstrating the cost, description, and calorie count:

```bash
Cost: $5.0
Description: Basic Coffee
Calories: 10

Cost: $7.0
Description: Basic Coffee with Milk with Milk with Sugar with Whipped Cream
Calories: 220
```

## How to Set Up the Project

1. **Create the Project Directory:**

   ```bash
   mkdir DecoratorPatternExample
   cd DecoratorPatternExample

   ```

2. **Create the src Directory:**

   ```bash
   mkdir src/coffee
   mkdir src/decorators

   ```

3. **Create java files:**

   *Create Coffee.java and BasicCoffee.java in the src/coffee directory.
   *Create CoffeeDecorator.java, MilkDecorator.java, SugarDecorator.java, and WhippedCreamDecorator.java in the src/decorators directory.
   \*Create Main.java in the src directory.

4. **Compile & run:**

   ```bash
   javac src/coffee/*.java src/decorators/*.java src/Main.java
   java -cp src Main
   ```

This setup demonstrates how to use the Decorator Pattern to dynamically enhance coffee objects with additional features like milk, sugar, and whipped cream, while tracking both cost and calories.
