package Message;

import java.util.HashMap;

public class MessageOrigin extends MessageMetadata {
    private final String origin;

    public MessageOrigin(Message message, String origin) {
        super(message);
        this.origin = origin;
    }

    @Override
    public HashMap<String, String> getData() {
        HashMap<String, String> information = super.getData();
        information.put("origin", origin);
        return super.getData();
    }
}
