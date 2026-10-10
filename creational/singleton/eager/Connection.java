public class Connection {

    // initialized when class loaded
    private static Connection connection = new Connection();

    // Private constructor can only be called from inside the class
    private Connection() {
    }

    public static Connection getInstance() {
        return connection;
    }
}
