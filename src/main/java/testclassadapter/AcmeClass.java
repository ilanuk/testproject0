package testclassadapter;

public class AcmeClass implements AcmeInterface {
    private String firstName;
    private String secondName;
    AcmeClass() {

    }
    AcmeClass(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }
    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getSecondName() {
        return secondName;
    }
}
