package Handler;

public class ConsoleHandler extends Handler{
    @Override
    public void handle(String message) {
        System.out.println(message);
        super.handle(message);
    }
}
