import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class AvocadoEntryReaderTest {

    AvocadoEntryReader reader = new AvocadoEntryReader();

    @Test
    void read() {
        List<AvocadoEntry> entries = reader.read();

        assertFalse(entries.isEmpty());
        assertEquals(18249, entries.size());
        AvocadoEntry result = entries.get(0);
        AvocadoEntry expected = createExpected();
        assertEquals(expected, result);
    }

    private AvocadoEntry createExpected() {
        return new AvocadoEntry("conventional",
                1.33,
                64236.62,
                "Albany",
                2015);
    }
}