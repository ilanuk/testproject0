package testabstractfactory;

public class MicrosoftSQLSecureConnection extends Connection {
    @Override
    public String description() {
        return "MicrosoftSQL secure";
    }

}
