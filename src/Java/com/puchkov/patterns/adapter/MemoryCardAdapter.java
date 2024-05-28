package Java.com.puchkov.patterns.adapter;

public class MemoryCardAdapter implements USB {
    private MemoryCard memoryCard;

    public MemoryCardAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void connectUSB() {
        System.out.println("Adapter connected to USB port");
    }

    @Override
    public String readUSB() {
        return memoryCard.read();
    }
}
