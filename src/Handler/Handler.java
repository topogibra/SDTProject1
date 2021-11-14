package Handler;

public abstract class Handler {

    Handler next;

    public void handle(String message) {
        if (next != null) {
            next.handle(message);
        }
    }

    public void setNext(Handler next) {
        this.next = next;
    }

}
