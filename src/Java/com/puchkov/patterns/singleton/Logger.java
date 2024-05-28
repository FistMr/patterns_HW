package Java.com.puchkov.patterns.singleton;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static Logger instance;

    private Logger() {
    }

    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void classLog(Object obj, String info) {
        String timestamp = DateTimeFormatter.ofPattern("dd.MM.yy").format(LocalDateTime.now());
        String message = String.format("Log info: %s - %s - %s", timestamp, obj.getClass().getSimpleName(), info);
        System.out.println(message);
    }
}