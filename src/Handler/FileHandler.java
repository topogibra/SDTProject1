package Handler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler extends Handler{
    File logFile;

    public FileHandler(File logFile) {
        this.logFile = logFile;
    }

    @Override
    public void handle(String message) {
        try {
            logFile.createNewFile();
            if(logFile.canWrite()){
                FileWriter logWriter = new FileWriter(logFile.getAbsolutePath());
                logWriter.write(message + "\n");
                logWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        super.handle(message);
    }
}
