package testabstractfactory;

public class MicrosoftSQLConnection extends Connection {

    @Override
    public String description() {
        return "MicrosoftSQL";
    }
}
