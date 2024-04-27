import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerFunction {

    private static Logger LOGGER = Logger.getLogger("InfoLogging");

    public void getLogger(String fileName, String message, String severity){

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        FileHandler fh;

        try {
            fh = new FileHandler(System.getProperty("user.dir") + "/" + fileName);
            LOGGER.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        switch (severity) {
            case "INFO":
                LOGGER.info(timestamp + " - " + message );
                break;
            case "WARNING":
                LOGGER.warning(timestamp + " - " + message );
                break;
            case "ERROR":
                LOGGER.severe(timestamp + " - " + message );
                break;
        }

        fh.close();
    }
}
