package Formatter;

import Message.Message;

import java.util.HashMap;
import java.util.stream.Collectors;

public class JSONFormatter implements Formatter{
    @Override
    public String format(Message message) {
        HashMap<String, String> dataMap = message.getData();
        return "{"+dataMap.entrySet().stream()
                .map(e -> "\""+ e.getKey() + "\":\"" + String.valueOf(e.getValue()) + "\"")
                .collect(Collectors.joining(", "))+"}";
    }
}
