package testadapter;

public class AceToAcmeAdapter implements AcmeInterface{
    private AceInterface ace;
    private String firstName;
    private String secondName;

    AceToAcmeAdapter(AceInterface ace) {
        this.ace = ace;
        this.firstName = ace.getName().split(" ")[0];
        this.secondName = ace.getName().split(" ")[1];
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
