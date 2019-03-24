package testiterator;

public class VP {
    private String name;
    private String division;

    public VP(String name, String division) {
        this.name = name;
        this.division = division;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    @Override
    public String toString() {
        return "VP{" +
                "name='" + name + '\'' +
                ", division='" + division + '\'' +
                '}';
    }
}
