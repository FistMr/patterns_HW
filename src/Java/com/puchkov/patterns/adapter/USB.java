package Java.com.puchkov.patterns.adapter;

public interface USB {
    void connectUSB();
    String readUSB();
}

class MemoryCard {
    public String read() {
        return "Data from Memory Card";
    }
}

class MemoryCardAdapter implements USB {
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

class Computer {
    public void readUSB(USB usbDevice) {
        usbDevice.connectUSB();
        System.out.println("Computer reading: " + usbDevice.readUSB());
    }
}