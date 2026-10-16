package creational.singleton.synchronizedmethod;

public class Connection {

    private static Connection connection;

    private Connection() {
    }

    // sync method can only be accessed by one thread at a time
    // so it prevents multiple object creation
    public static synchronized Connection getInstance() {

        // initialized when its null
        if (connection == null) {
            connection = new Connection();
        }
        return connection;
    }
}