# Observer Pattern Example

This project demonstrates the Observer Pattern by creating a `NewsAgency` that sends updates to multiple `Subscriber` objects.

## Project Structure

- `src/observer/Observer.java`: Interface for subscribers to receive updates.
- `src/observer/Subscriber1.java`: Concrete implementation of a subscriber.
- `src/observer/Subscriber2.java`: Another concrete implementation of a subscriber.
- `src/subject/Subject.java`: Interface for the news agency to manage subscribers.
- `src/subject/NewsAgency.java`: Concrete implementation of a news agency that notifies subscribers.
- `src/Main.java`: Entry point to demonstrate subscribing, unsubscribing, and receiving news updates.

## How to Run

1. **Compile the Java files:**

   ```bash
   javac src/observer/*.java src/subject/*.java src/Main.java
   ```

2. **Run the main class:**
   ```bash
   java -cp src Main
   ```

You should see output showing how subscribers receive news updates and how they can be unsubscribed.

## How to Set Up the Project

1. **Create the Project Directory:**

   ```bash
   mkdir ObserverPatternExample
   cd ObserverPatternExample

   ```

2. **Create the src Directory:**

   ```bash
   mkdir src/observer
   mkdir src/subject

   ```

3. **Create java files:**

   *Create Observer.java, Subscriber1.java, and Subscriber2.java in the src/observer directory.
   *Create Subject.java and NewsAgency.java in the src/subject directory.
   *Create Main.java in the src directory.
   *Create a README.md file in the root directory with the provided content.

4. **Compile & run:**

   ```bash
   javac src/observer/*.java src/subject/*.java src/Main.java
   java -cp src Main
   ```

This setup demonstrates how to use the Observer Pattern to manage updates and notifications, making it easy to notify multiple subscribers of changes.
