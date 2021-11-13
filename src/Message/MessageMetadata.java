package Message;

import java.util.HashMap;

public abstract class MessageMetadata implements Message {
    private final Message message;

    public MessageMetadata(Message message) {
        this.message = message;
    }

    @Override
    public HashMap<String, String> getData() {
        return message.getData();
    }
}
