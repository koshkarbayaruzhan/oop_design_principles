import design.*;

public class Main {
    public static void main(String[] args) {

        Logger.log("INFO", "Application started");

        DatabaseService db = new DatabaseService();
        db.connect();

        KissExamples kiss = new KissExamples();
        kiss.processNumbers(new int[]{1, -2, 3, 0});

        User user = new User();
        user.name = "Test";
        user.email = "test@mail.com";
    }
}

