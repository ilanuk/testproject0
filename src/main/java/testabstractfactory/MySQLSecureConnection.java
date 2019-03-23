package testabstractfactory;

public class MySQLSecureConnection extends Connection {
    @Override
    public String description() {
        return "MySQL secure";
    }
}
