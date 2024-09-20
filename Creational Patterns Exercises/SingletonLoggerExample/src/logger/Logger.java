package logger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static Logger instance;
    private LogLevel logLevel;
    private boolean logToFile;
    private int logCount;
    private PrintWriter writer;

    public enum LogLevel {
        INFO, DEBUG, ERROR
    }

    private Logger() {
        this.logLevel = LogLevel.INFO;
        this.logToFile = false;
        this.logCount = 0;
        try {
            writer = new PrintWriter(new FileWriter("logs/app.log", true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void setLogLevel(LogLevel level) {
        this.logLevel = level;
    }

    public void enableFileLogging() {
        this.logToFile = true;
    }

    public void log(LogLevel level, String message) {
        if (level.ordinal() >= this.logLevel.ordinal()) {
            String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            String logMessage = String.format("[%s] %s: %s", timestamp, level, message);

            System.out.println(logMessage);

            if (logToFile) {
                writer.println(logMessage);
                writer.flush();
            }

            logCount++;
        }
    }

    public void clearLogs() {
        try {
            PrintWriter fileCleaner = new PrintWriter("logs/app.log");
            fileCleaner.close();

            logCount = 0;
            System.out.println("Logs cleared.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getLogCount() {
        return logCount;
    }

    public void closeLogger() {
        writer.close();
    }
}
