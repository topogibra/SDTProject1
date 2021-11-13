package Message;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class MessageTimeStamp extends MessageMetadata{
    private final Date timestamp;
    private SimpleDateFormat timeFormatter;


    public MessageTimeStamp(Message message) {
        super(message);
        this.timestamp = Calendar.getInstance().getTime();
    }

    public MessageTimeStamp(Message message, Date timestamp) {
        super(message);
        this.timestamp = timestamp;
    }

    @Override
    public HashMap<String, String> getData() {
        HashMap<String, String> information = super.getData();
        information.put("timeStamp", timeFormatter.format(timestamp));
        return information;
    }

    public void setTimeFormatter(SimpleDateFormat timeFormatter) {
        this.timeFormatter = timeFormatter;
    }
}
