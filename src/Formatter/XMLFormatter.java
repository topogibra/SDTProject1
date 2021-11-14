package Formatter;

import Message.Message;

import java.util.Map;

public class XMLFormatter implements Formatter{
    @Override
    public String format(Message message) {
        StringBuilder xmlBuffer = new StringBuilder();
        xmlBuffer.append("<root>");
        for (Map.Entry<String,String> entry: message.getData().entrySet()) {
            xmlBuffer.append("<").append(entry.getKey()).append(">");
            xmlBuffer.append(entry.getValue());
            xmlBuffer.append("</").append(entry.getKey()).append(">");

        }
        xmlBuffer.append("</root>");
        return xmlBuffer.toString();
    }
}
