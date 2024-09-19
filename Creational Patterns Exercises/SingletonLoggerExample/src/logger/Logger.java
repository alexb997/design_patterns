package logger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    public enum LogMode {
        CONSOLE_ONLY, FILE_ONLY, BOTH
    }

    private static Logger instance;

    private LogMode logMode = LogMode.CONSOLE_ONLY;

    private static final String LOG_FILE = "application.log";

    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void setLogMode(LogMode mode) {
        this.logMode = mode;
    }

    public void log(String message) {
        String timestampedMessage = getTimestamp() + " - " + message;

        if (logMode == LogMode.CONSOLE_ONLY || logMode == LogMode.BOTH) {
            logToConsole(timestampedMessage);
        }

        if (logMode == LogMode.FILE_ONLY || logMode == LogMode.BOTH) {
            logToFile(timestampedMessage);
        }
    }

    private void logToConsole(String message) {
        System.out.println(message);
    }

    private void logToFile(String message) {
        try (FileWriter fw = new FileWriter(LOG_FILE, true);
             PrintWriter pw = new PrintWriter(fw)) {
            pw.println(message);
        } catch (IOException e) {
            System.err.println("Error writing to log file: " + e.getMessage());
        }
    }

    public void clearLogs() {
        try (PrintWriter pw = new PrintWriter(LOG_FILE)) {
            pw.print("");
        } catch (IOException e) {
            System.err.println("Error clearing log file: " + e.getMessage());
        }
        System.out.println("Logs cleared.");
    }

    private String getTimestamp() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return now.format(formatter);
    }
}
