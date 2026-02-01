package design;

public class LoggingService {

    public void log(String message) {
        String connectionString = Config.CONNECTION_STRING;
        System.out.println("Logging to DB: " + message);
    }
}
