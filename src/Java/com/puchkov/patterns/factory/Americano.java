package Java.com.puchkov.patterns.factory;

public class Americano extends Coffee {
    @Override
    public void brew() {
        System.out.println("Brewing Americano");
    }
}