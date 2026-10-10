public class Connection {

    private static Connection connection;
    private Connection() {
    }

    public static Connection getInstance() {

        // initialized when its null
        if (connection == null) {
            connection = new Connection();
        }
        return connection;
    }
}
