import logger.Logger;
import logger.Logger.LogLevel;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getInstance();

        logger.setLogLevel(LogLevel.DEBUG);

        logger.setLoggingMode(true, false);
        logger.log(LogLevel.INFO, "This is an info log.");
        logger.log(LogLevel.DEBUG, "This is a debug log.");
        logger.log(LogLevel.ERROR, "This is an error log.");

        logger.setLoggingMode(false, true);
        logger.setLogFileName("logs/app.log");
        logger.log(LogLevel.INFO, "Logging to file now.");
        logger.log(LogLevel.DEBUG, "Debugging in the file.");
        
        logger.setLoggingMode(true, true);
        logger.log(LogLevel.ERROR, "This message goes to both console and file.");

        logger.clearLogs();
        System.out.println("Total logs count: " + logger.getLogCount());
    }
}
