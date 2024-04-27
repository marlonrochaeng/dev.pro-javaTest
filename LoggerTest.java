import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;

public class LoggerTest {
    @Test
    void LoggerFileTest() {
        LoggerFunction loggerFunction = new LoggerFunction();


        File f1 = new File(System.getProperty("user.dir") + "/" + "test.log");
        assertFalse(f1.exists());
        loggerFunction.getLogger("test.log", "message 1", "INFO");
        assertTrue(f1.exists());

        f1 = new File(System.getProperty("user.dir") + "/" + "test2.log");
        assertFalse(f1.exists());
        loggerFunction.getLogger("test2.log", "message 2", "WARNING");
        assertTrue(f1.exists());

        f1 = new File(System.getProperty("user.dir") + "/" + "test3.log");
        assertFalse(f1.exists());
        loggerFunction.getLogger("test3.log", "message 3", "ERROR");
        assertTrue(f1.exists());

        // Create and add products to the list

    }
}
