package testiterator;

public class Division {
    private String name;
    private VP[] vps = new VP[100];
    private int counter = 0;

    public Division(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void add(String vpName) {
        VP vp = new VP(vpName, name);
        vps[counter++] = vp;
    }

    public DivisionIterator iterator() {
        return new DivisionIterator(vps);
    }
}
