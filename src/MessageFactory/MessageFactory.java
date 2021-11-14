package MessageFactory;

import Message.Message;

public interface MessageFactory {
    Message createMessage(String data);
}
