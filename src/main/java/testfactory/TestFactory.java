package testfactory;

public class TestFactory {
    public static void main(String[] args) {
        FirstFactory firstFactory;
        firstFactory = new FirstFactory("Oracle");
        Connection connection = firstFactory.createConnection();
        System.out.println("You are connection with "+connection.description());
    }
}
