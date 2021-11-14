package MessageFactory;

import Message.*;

public class SimpleMessageFactory  implements MessageFactory{
    @Override
    public Message createMessage(String data) {
        return new MessageData(data);
    }
}
