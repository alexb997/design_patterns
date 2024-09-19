# Chain of Responsibility Pattern Example

This project demonstrates the Chain of Responsibility Pattern by implementing a support system where different levels of support staff handle customer requests.

## Project Structure

- `src/support/SupportHandler.java`: Interface for support handlers.
- `src/support/LowLevelSupport.java`: Concrete implementation for low-level support.
- `src/support/MidLevelSupport.java`: Concrete implementation for mid-level support.
- `src/support/HighLevelSupport.java`: Concrete implementation for high-level support.
- `src/Main.java`: Entry point to demonstrate the chain of responsibility.

## How to Run

1. **Compile the Java files:**

   ```bash
   javac src/support/*.java src/Main.java

   ```

2. **Run the main class:**
   ```bash
   java -cp src Main
   ```

You should see output demonstrating how requests are handled by different levels of support.

## How to Set Up the Project

1. **Create the Project Directory:**

   ```bash
   mkdir ChainOfResponsibilityExample
   cd ChainOfResponsibilityExample

   ```

2. **Create the src Directory:**

   ```bash
   mkdir src/support

   ```

3. **Create java files:**

   *Create SupportHandler.java, LowLevelSupport.java, MidLevelSupport.java, and HighLevelSupport.java in the src/support directory.
   *Create Main.java in the src directory.
   \*Create a README.md file in the root directory with the provided content.

4. **Compile & run:**

   ```bash
   javac src/support/*.java src/Main.java
   java -cp src Main
   ```

This setup demonstrates how the Chain of Responsibility Pattern allows for handling requests through a chain of handlers, each responsible for a specific level of request complexity.
