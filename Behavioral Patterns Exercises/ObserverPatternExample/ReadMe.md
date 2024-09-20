# Observer Pattern Enhanced

This project demonstrates the **Observer Pattern** with additional features, including filtering news by type, daily digests, and personalized messages. The Observer Pattern allows objects (subscribers) to observe and react to changes in another object (news agency) without tightly coupling the objects.

## Features

- **News Categorization**: Subscribers can subscribe to specific categories of news, such as Sports, Politics, Entertainment, or General.
- **Daily Digest**: Special subscribers (e.g., DailyDigestSubscriber) can receive a summary of all the news published at the end of the day.
- **Personalized Messages**: The NewsAgency can send personalized messages to individual subscribers.

## Project Structure

- `src/news/`: Contains the news-related classes.
  - `NewsType.java`: Enum defining categories of news (e.g., Sports, Politics, Entertainment).
  - `NewsAgency.java`: Manages subscribers and publishes news.
- `src/subscribers/`: Contains all subscriber classes.
  - `Subscriber.java`: Interface for all subscriber types.
  - `EmailSubscriber.java`: A concrete subscriber for receiving email notifications.
  - `SmsSubscriber.java`: A concrete subscriber for receiving SMS notifications.
  - `DailyDigestSubscriber.java`: A special subscriber for receiving a daily digest of news.
- `src/Main.java`: The entry point of the application to demonstrate the Observer Pattern in action.

## How to Run

1. **Compile the Java files:**

   ```bash
   javac src/news/*.java src/subscribers/*.java src/Main.java

   ```

2. **Run the main class:**
   ```bash
   java -cp src Main
   ```

## You should see output demonstrating:

- How subscribers receive news updates based on their preferences.
- How daily digests are provided to DailyDigestSubscriber.
- How personalized messages can be sent to subscribers.

## Example Workflow

1.  The NewsAgency publishes news in different categories such as Sports, Politics, and Entertainment.
2.  Subscribers receive notifications only for the categories they are interested in.
3.  At the end of the day, the DailyDigestSubscriber receives a summary of all news.
4.  The NewsAgency can send personalized messages directly to individual subscribers.

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

   - Create NewsType.java and NewsAgency.java in the src/news/ directory.
   - Create Subscriber.java, EmailSubscriber.java, SmsSubscriber.java, and DailyDigestSubscriber.java in the src/subscribers/ directory.
   - Create Main.java in the src directory.

4. **Compile & run:**

   ```bash
   javac src/news/*.java src/subscribers/*.java src/Main.java
   java -cp src Main
   ```

This setup demonstrates how to use the Observer Pattern with enhancements such as filtering by news type, providing daily summaries, and sending personalized messages.
