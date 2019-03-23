package testabstractfactory;

public class SecureConnectionFactory extends AbstractFactory {
    protected String type;

    SecureConnectionFactory(String type) {
        this.type = type;
    }

    @Override
    public Connection createConnection() {
        if (type.equalsIgnoreCase("ORACLE")) {
            return new OracleSecureConnection();
        }
        else if (type.equalsIgnoreCase("Microsoft SQL")) {
            return new MicrosoftSQLSecureConnection();
        }
        else {
            return new MySQLSecureConnection();
        }

    }
}
