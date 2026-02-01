package design;

public class DatabaseService {

    public void connect() {
        String connectionString = Config.CONNECTION_STRING;
        System.out.println("Connecting to DB: " + connectionString);
    }
}
