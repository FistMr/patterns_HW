package Java.com.puchkov.patterns.factory;

abstract class Coffee {
    public abstract void brew();
}

class Espresso extends Coffee {
    @Override
    public void brew() {
        System.out.println("Brewing Espresso");
    }
}

class Americano extends Coffee {
    @Override
    public void brew() {
        System.out.println("Brewing Americano");
    }
}

class CoffeeFactory {
    public Coffee getCoffee(String type) {
        switch (type.toLowerCase()) {
            case "espresso":
                return new Espresso();
            case "americano":
                return new Americano();
            default:
                throw new IllegalArgumentException("Unknown coffee type");
        }
    }
}