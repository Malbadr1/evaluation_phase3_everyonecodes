import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComputerServiceTest {
    private ComputerService computerService;
    private WiFiMessage wifiMessage;

    @Before
    public void setup() {
        computerService = new ComputerService();
        wifiMessage = new WiFiMessage("Hello world", 5000);
    }

    @Test
    public void testReceive() {
// Test receiving a message on a supported frequency
        String message = computerService.receive(wifiMessage);
        assertEquals("Hello world", message);
        // Test receiving a message on an unsupported frequency
        wifiMessage.setFrequency(2300);
        message = computerService.receive(wifiMessage);
        assertNull(message);
    }}