import logger.Logger;
import logger.Logger.LogLevel;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.setLogLevel(LogLevel.INFO);

        logger.log(LogLevel.INFO, "This is an INFO message.");
        logger.log(LogLevel.DEBUG, "This DEBUG message should not appear.");
        logger.log(LogLevel.ERROR, "This is an ERROR message.");

        logger.enableFileLogging();

        logger.log(LogLevel.INFO, "Logging to both console and file.");

        logger.clearLogs();

        logger.log(LogLevel.INFO, "Logging after clearing logs, with a timestamp.");

        logger.closeLogger();
    }
}
