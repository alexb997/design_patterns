package log;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class Logger {
    private static Logger instance;
    private PrintWriter writer;

    private Logger() {
        try {
            writer = new PrintWriter(new FileWriter("log.txt", true));
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

    public void log(String message) {
        writer.println(LocalDateTime.now() + " - " + message);
        writer.flush();
    }

    public void clearLog() {
        try {
            new PrintWriter(new FileWriter("log.txt", false)).close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
