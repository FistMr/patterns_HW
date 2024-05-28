package Java.com.puchkov.patterns.proxy;

public interface Database {
    void connect();
}

class RealDatabase implements Database {
    private String dbName;

    public RealDatabase(String dbName) {
        this.dbName = dbName;
    }

    @Override
    public void connect() {
        System.out.println("Connected to " + dbName);
    }
}

class DatabaseProxy implements Database {
    private RealDatabase realDatabase;
    private String host;
    private int port;

    public DatabaseProxy(String dbName, String host, int port) {
        this.realDatabase = new RealDatabase(dbName);
        this.host = host;
        this.port = port;
    }

    @Override
    public void connect() {
        System.out.println("Connecting through proxy to " + host + ":" + port);
        realDatabase.connect();
        System.out.println("Connected to localhost:" + port + "/" + realDatabase);
    }
}