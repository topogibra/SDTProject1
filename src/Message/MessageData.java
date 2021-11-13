package Message;

import java.util.HashMap;

public class MessageData implements Message {
    String data;

    public MessageData(String data) {
        this.data = data;
    }

    @Override
    public HashMap<String,String>getData() {
        HashMap<String, String> information = new HashMap<>();
        information.put("data", data);
        return information;
    }
}
