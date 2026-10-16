package creational.singleton.doublecheckedlocking;

public class Connection {

    private static Connection connection;

    private Connection() {
    }

    public static Connection getInstance() {

        // Duble check for null
        if (connection == null) {

            // only one thread can enter
            synchronized (Connection.class) {
                if (connection == null) {
                    connection = new Connection();
                }
            }
        }
        return connection;
    }

}