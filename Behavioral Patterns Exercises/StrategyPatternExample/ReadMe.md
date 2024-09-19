# Strategy Pattern Example

This project demonstrates the Strategy Pattern by implementing a `PaymentSystem` that supports different payment methods using strategies.

## Project Structure

- `src/payment/PaymentStrategy.java`: Interface for payment strategies.
- `src/payment/CreditCardPayment.java`: Concrete implementation for credit card payments.
- `src/payment/PayPalPayment.java`: Concrete implementation for PayPal payments.
- `src/PaymentSystem.java`: Context class that uses the payment strategy.
- `src/Main.java`: Entry point to demonstrate using different payment methods.

## How to Run

1. **Compile the Java files:**

   ```bash
   javac src/payment/*.java src/PaymentSystem.java src/Main.java
   ```

2. **Run the main class:**
   ```bash
   java -cp src Main
   ```

You should see output demonstrating payments using both credit card and PayPal.

## How to Set Up the Project

1. **Create the Project Directory:**

   ```bash
   mkdir StrategyPatternExample
   cd StrategyPatternExample

   ```

2. **Create the src Directory:**

   ```bash
   mkdir src/payment

   ```

3. **Create java files:**

   *Create PaymentStrategy.java, CreditCardPayment.java, and PayPalPayment.java in the src/payment directory.
   *Create PaymentSystem.java and Main.java in the src directory.
   \*Create a README.md file in the root directory with the provided content.

4. **Compile & run:**

   ```bash
   javac src/payment/*.java src/PaymentSystem.java src/Main.java
    java -cp src Main
   ```

This setup demonstrates how to use the Strategy Pattern to allow a PaymentSystem to switch between different payment methods dynamically, adhering to the principle of encapsulating payment algorithms.
