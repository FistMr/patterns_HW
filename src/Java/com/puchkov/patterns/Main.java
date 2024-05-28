package Java.com.puchkov.patterns;

import Java.com.puchkov.patterns.adapter.*;
import Java.com.puchkov.patterns.factory.*;
import Java.com.puchkov.patterns.proxy.*;
import Java.com.puchkov.patterns.singleton.*;

public class Main {
    public static void main(String[] args) {

//        Logger logger = Logger.getInstance();
//        logger.classLog(new Object(), "This is a test log message.");


//        CoffeeFactory coffeeFactory = new CoffeeFactory();
//        Coffee coffee = coffeeFactory.getCoffee("espresso");
//        coffee.brew();
//
//        coffee = coffeeFactory.getCoffee("americano");
//        coffee.brew();


//        MemoryCard memoryCard = new MemoryCard();
//        MemoryCardAdapter adapter = new MemoryCardAdapter(memoryCard);
//        Computer computer = new Computer();
//        computer.readUSB(adapter);


        DatabaseProxy dbProxy = new DatabaseProxy("exampleDatabase", "localhost", 3306);
        dbProxy.connect();
    }
}
