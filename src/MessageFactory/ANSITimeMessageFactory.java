package MessageFactory;

import Message.*;

import java.text.SimpleDateFormat;

public class ANSITimeMessageFactory implements MessageFactory {
    @Override
    public  Message createMessage(String data) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        MessageData messageData = new MessageData(data);
        MessageTimeStamp message = new MessageTimeStamp(messageData);
        message.setTimeFormatter(simpleDateFormat);
        return message;
    }
}
