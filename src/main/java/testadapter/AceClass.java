package testadapter;

public class AceClass implements AceInterface {
    private String name;
    AceClass(String name) {
        this.name = name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
