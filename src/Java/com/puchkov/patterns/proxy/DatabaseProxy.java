package Java.com.puchkov.patterns.proxy;

public class DatabaseProxy implements Database {
    private RealDatabase realDatabase;

    public DatabaseProxy(String dbName, String host, int port) {
        this.realDatabase = new RealDatabase(dbName, host, port);
    }

    @Override
    public void connect() {
        System.out.println("Connecting through proxy...");
        realDatabase.connect();
    }
}
