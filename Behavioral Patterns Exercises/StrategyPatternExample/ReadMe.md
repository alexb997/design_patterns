# Strategy Pattern Example

This project demonstrates the **Strategy Pattern** by implementing various payment methods (CreditCard, PayPal, Bitcoin) and allowing users to choose a payment method at runtime. The system can handle payment failures and retries, calculate processing fees, and convert between different currencies.

## Project Structure

- `src/strategy/PaymentStrategy.java`: Interface for the payment strategy, includes methods for payment processing and fee calculation.
- `src/strategy/CreditCardPayment.java`: Strategy for credit card payments, includes currency conversion and payment retry logic.
- `src/strategy/PayPalPayment.java`: Strategy for PayPal payments, with processing fee calculation.
- `src/strategy/BitcoinPayment.java`: New strategy for Bitcoin payments.
- `src/context/PaymentContext.java`: Context class to manage the current payment strategy and handle currency conversion.
- `src/Main.java`: Entry point demonstrating the different payment methods and handling of failures.

## How to Run

1. **Compile the Java files:**

   ```bash
   javac src/strategy/*.java src/context/PaymentContext.java src/Main.java
   ```

2. **Run the main class:**
   ```bash
   java -cp src Main
   ```

The output will show the payment processing for each method, including handling of fees and retries:

```bash
Attempting to pay: 100.0 in USD
Processing fee: 2.0
Payment successful.
Attempting to pay: 100.0 in EUR
Processing fee: 3.0
Payment failed! Retrying...
Payment retry successful.
Attempting to pay: 100.0 in BTC
Processing fee: 1.0
Payment failed! Retrying...
Payment failed again! Attempting to switch payment method...
```

## How to Set Up the Project

1. **Create the Project Directory:**

```bash
mkdir StrategyPatternExample
cd StrategyPatternExample

```

2. **Create the src Directory:**

   ```bash
   mkdir src/strategy
   mkdir src/context

   ```

3. **Create java files:**

   *Create PaymentStrategy.java, CreditCardPayment.java, PayPalPayment.java, and BitcoinPayment.java in the src/strategy directory.
   *Create PaymentContext.java in the src/context directory.
   \*Create Main.java in the src directory.

4. **Compile & run:**

   ```bash
   javac src/strategy/*.java src/context/PaymentContext.java src/Main.java
   java -cp src Main
   ```

This setup demonstrates how the Strategy Pattern enables flexible payment methods with additional features such as processing fees, retries, and currency conversion.
