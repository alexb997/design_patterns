# Builder Pattern Example

This project demonstrates the **Builder Pattern** for constructing a customizable `Computer` object with various components (CPU, RAM, Graphics Card, Cooling System). The builder ensures flexibility in creating computers with different configurations.

## New Features

1. **Add Components**: Add a CPU, RAM, Graphics Card, and Cooling System to the computer.
2. **Validation**: Ensure high-performance computers have a cooling system.
3. **Bulk Creation**: Build multiple computers with identical configurations using the `buildBulk()` method.

## Project Structure

- `src/computer/Computer.java`: Represents a computer with various components.
- `src/computer/Component.java`: A class representing individual components of the computer.
- `src/computer/CoolingSystem.java`: Enum for different cooling systems.
- `src/computer/ComputerBuilder.java`: Builder class to construct `Computer` objects.
- `src/computer/HighPerformanceComputerException.java`: Custom exception for validation when building a high-performance computer.
- `src/Main.java`: Demonstrates how to use the `ComputerBuilder` class to build computers.

## How to Run

1. **Compile the Java files:**

   ```bash
   javac src/computer/*.java src/Main.java
   ```

2. **Run the main class:**
   ```bash
   java -cp src Main
   ```

## Input Parameters/Steps

- Build a computer with a CPU, RAM, and a Graphics Card.
- Add an AirCooling system to the computer.
- Call getPrice() on the computer to retrieve the total cost.
- Attempt to build a high-performance computer without a cooling system.
- Use the buildBulk(10) method to create 10 identical computers.

## Expected Results

- Step 1: A computer with the specified components is built successfully.
- Step 2: The cooling system is added (Air Cooling or Liquid Cooling).
- Step 3: The total price is calculated based on the selected components.
- Step 4: A validation error is raised if a high-performance computer is built without a cooling system.
- Step 5: The buildBulk(10) method successfully creates 10 computers with the same configuration.

## Example Output

```bash
Computer [CPU=Intel i7, RAM=16GB, Graphics Card=NVIDIA RTX 3080, Cooling System=Air Cooling]
Price: $950.0
Error: High-performance computer must have a cooling system.

Built 10 computers:
Computer 1: Computer [CPU=Intel i7, RAM=16GB, Graphics Card=NVIDIA RTX 3080, Cooling System=Air Cooling]
Computer 2: Computer [CPU=Intel i7, RAM=16GB, Graphics Card=NVIDIA RTX 3080, Cooling System=Air Cooling]
Computer 10: Computer [CPU=Intel i7, RAM=16GB, Graphics Card=NVIDIA RTX 3080, Cooling System=Air Cooling]
```

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

   *Create Computer.java, CoolingSystem.java, Component.java, HighPeformanceComputerException.java, and ComputerBuilder.java in the src/computer directory.
   *Create Main.java in the src directory.

4. **Compile & run:**

   ```bash
   javac src/computer/*.java src/Main.java
   java -cp src Main
   ```

This setup demonstrates how to use the Builder Pattern to construct complex objects with various configurations and handle bulk creation.
