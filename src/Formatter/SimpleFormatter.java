package Formatter;

import Message.Message;

import java.util.Iterator;
import java.util.Map;

public class SimpleFormatter implements Formatter{
    @Override
    public String format(Message message) {
        StringBuilder buffer = new StringBuilder();

        Iterator<Map.Entry<String, String>> iterator = message.getData().entrySet().iterator();
        buffer.append("Message:\n");
        while (iterator.hasNext()) {
            Map.Entry<String,String> entry = iterator.next();
            buffer.append(entry.getValue());
            if(iterator.hasNext())
                buffer.append(" ");
            iterator.remove();
        }
        return buffer.toString();
    }
}
