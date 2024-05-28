package Java.com.puchkov.patterns.adapter;

public class Computer {
    public void readUSB(USB usbDevice) {
        usbDevice.connectUSB();
        System.out.println("Computer reading: " + usbDevice.readUSB());
    }
}
