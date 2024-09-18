public class Main {
    public static void main(String[] args) {
        // Access the Logger instance
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Log messages using the singleton instance
        logger1.log("This is the first log message.");
        logger2.log("This is the second log message.");

        // Check if both loggers are the same instance
        System.out.println(logger1 == logger2); // This will print 'true', confirming it's the same instance.
    }
}
