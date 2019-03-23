package testabstractfactory;

public class TestAbstractFactory {
    public static void main(String[] args) {
        AbstractFactory factory = new SecureConnectionFactory("Oracle");
        Connection connection = factory.createConnection();
        System.out.println("Connected to " + connection.description());

        factory = new NormalConnectionFactory("MySQL");
        connection = factory.createConnection();
        System.out.println("Connected to " + connection.description());

    }
}
