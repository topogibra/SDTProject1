package Handler;

public class DatabaseHandler extends Handler{
    @Override
    public void handle(String message) {
        System.out.println("Sent "+ message + "to database successfully");
        super.handle(message);
    }
}
