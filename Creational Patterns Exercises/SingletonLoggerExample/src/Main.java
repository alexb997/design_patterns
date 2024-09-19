import logger.Logger;
import logger.Logger.LogMode;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.setLogMode(LogMode.CONSOLE_ONLY);
        logger.log("This is a console log message.");

        logger.setLogMode(LogMode.FILE_ONLY);
        logger.log("This is a file log message.");

        logger.setLogMode(LogMode.BOTH);
        logger.log("This is a message logged to both console and file.");

        logger.clearLogs();
    }
}
