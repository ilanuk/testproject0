package testabstractfactory;

public class OracleSecureConnection extends Connection {

    @Override
    public String description() {
        return "Oracle secure";
    }

}
