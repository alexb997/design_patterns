# Observer Pattern Enhanced

This project demonstrates the **Observer Pattern** with additional features, including filtering news by type, daily digests, and personalized messages. The Observer Pattern allows objects (subscribers) to observe and react to changes in another object (news agency) without tightly coupling the objects.

## Project Structure

- `src/news/NewsType.java`: Enum defining categories of news (e.g., Sports, Politics, Entertainment).
- `src/news/NewsAgency.java`: Concrete implementation of a news agency that manages and notifies subscribers.
- `src/subscribers/Subscriber.java`: Interface for all types of subscribers.
- `src/subscribers/EmailSubscriber.java`: Concrete implementation of a subscriber receiving updates via email.
- `src/subscribers/SmsSubscriber.java`: Concrete implementation of a subscriber receiving updates via SMS.
- `src/subscribers/DailyDigestSubscriber.java`: Concrete implementation of a subscriber receiving a daily summary of news.
- `src/Main.java`: Entry point to demonstrate subscribing, unsubscribing, and receiving news updates.

## How to Run

1. **Compile the Java files:**

   ```bash
   javac src/news/*.java src/subscribers/*.java src/Main.java
   ```

2. **Run the main class:**
   ```bash
   java -cp src Main
   ```

You should see output demonstrating how subscribers receive news updates based on their preferences, how daily digests are provided, and how personalized messages can be sent.

## How to Set Up the Project

1. **Create the Project Directory:**

   ```bash
   mkdir ObserverPatternEnhanced
   cd ObserverPatternEnhanced

   ```

2. **Create the src Directory:**

   ```bash
   mkdir src
   mkdir src/news
   mkdir src/subscribers

   ```

3. **Create java files:**

   *Create NewsType.java in the src/news directory.
   *Create NewsAgency.java in the src/news directory.
   *Create Subscriber.java in the src/subscribers directory.
   *Create EmailSubscriber.java, SmsSubscriber.java, and DailyDigestSubscriber.java in the src/subscribers directory.
   *Create Main.java in the src directory.

4. **Compile & run:**

   ```bash
   javac src/news/*.java src/subscribers/*.java src/Main.java
   java -cp src Main
   ```

This setup demonstrates how to use the Observer Pattern with enhancements such as filtering by news type, providing daily summaries, and sending personalized messages.
