import java.util.ArrayList;
import java.util.List;

public class WiFiMessage {
    private String content;
    private int frequency;

    public WiFiMessage(String content, int frequency) {
        this.content = content;
        this.frequency = frequency;
    }

    public String getContent() {
        return content;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}

interface WiFiCard {
    public int getFrequency();
}

class WiFiCard5GHz implements WiFiCard {
    private final int frequency = 5000;

    public int getFrequency() {
        return frequency;
    }
}

class WiFiCard2Point4GHz implements WiFiCard {
    private final int frequency = 2400;

    public int getFrequency() {
        return frequency;
    }
}

class ComputerService {
    private List<WiFiCard> cards;

    public ComputerService() {
        cards = new ArrayList<>();
        cards.add(new WiFiCard5GHz());
        cards.add(new WiFiCard2Point4GHz());
    }

    public String receive(WiFiMessage message) {
        for (WiFiCard card : cards) {
            if (card.getFrequency() == message.getFrequency()) {
                return message.getContent();
            }
        }
        return null;
    }
}