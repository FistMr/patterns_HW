package Java.com.puchkov.patterns.proxy;

public class RealDatabase implements Database {
    private String dbName;
    private String host;
    private int port;

    public RealDatabase(String dbName, String host, int port) {
        this.dbName = dbName;
        this.host = host;
        this.port = port;
    }

    @Override
    public void connect() {
        System.out.println("Connected to " + host + ":" + port + "/" + dbName);
    }
}
