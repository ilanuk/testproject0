package testfactory;

public class FirstFactory {
    protected  String type;

    public FirstFactory(String type) {
        this.type = type;
    }

    public Connection createConnection() {
        if (type.equalsIgnoreCase("ORACLE")) {
            return new OracleConnection();
        }
        else if (type.equalsIgnoreCase("Microsoft SQL")) {
            return new MicrosoftSQLConnection();
        }
        else {
            return new MySQLConnection();
        }
    }

    public String getType() {
        return type;
    }
}
