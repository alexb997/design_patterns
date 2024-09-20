package logger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static Logger instance;
    private LogLevel currentLogLevel;
    private String logFileName;
    private boolean logToFile;
    private boolean logToConsole;
    private int logCount;
    
    private static final Object lock = new Object();
    private static final String DEFAULT_LOG_FILE = "logs/default.log";

    public enum LogLevel {
        INFO, DEBUG, ERROR
    }

    private Logger() {
        this.currentLogLevel = LogLevel.INFO;
        this.logFileName = DEFAULT_LOG_FILE;
        this.logToConsole = true;
        this.logToFile = false;
        this.logCount = 0;
    }

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void setLogLevel(LogLevel logLevel) {
        this.currentLogLevel = logLevel;
    }

    public void setLoggingMode(boolean toConsole, boolean toFile) {
        this.logToConsole = toConsole;
        this.logToFile = toFile;
    }

    public void setLogFileName(String fileName) {
        this.logFileName = fileName != null ? fileName : DEFAULT_LOG_FILE;
    }

    public int getLogCount() {
        return logCount;
    }

    public void clearLogs() throws IOException {
        if (logToFile) {
            PrintWriter writer = new PrintWriter(logFileName);
            writer.print("");
            writer.close();
        }
        logCount = 0;
        System.out.println("Logs cleared.");
    }

    public void log(LogLevel logLevel, String message) {
        if (logLevel.ordinal() >= currentLogLevel.ordinal()) {
            String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            String logMessage = String.format("[%s] [%s] %s", timeStamp, logLevel, message);

            if (logToConsole) {
                System.out.println(logMessage);
            }
            if (logToFile) {
                try (FileWriter fw = new FileWriter(logFileName, true)) {
                    fw.write(logMessage + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            logCount++;
        }
    }
}
