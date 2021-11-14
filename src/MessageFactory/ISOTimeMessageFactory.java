package MessageFactory;

import Message.*;

import java.text.SimpleDateFormat;

public class ISOTimeMessageFactory implements MessageFactory{
    @Override
    public Message createMessage(String data) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss'T'XX");
        MessageData messageData = new MessageData(data);
        MessageTimeStamp message = new MessageTimeStamp(messageData);
        message.setTimeFormatter(simpleDateFormat);
        return message;
    }
}
