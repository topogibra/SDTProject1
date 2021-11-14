import Message.*;
import MessageFactory.*;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        MessageFactory factory = new ISOTimeMessageFactory();
        Message message = factory.createMessage("teste");
        HashMap<String, String> map = message.getData();
        System.out.println(message);
    }
}
