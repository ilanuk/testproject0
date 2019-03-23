package testtemplate;

public class CookieRobot extends RobotTemplate{
    private String name;

    CookieRobot(String name) {
        this.name = name;
    }

    @Override
    public void getParts() {
        System.out.println("Getting flavor and sugar");
    }

    @Override
    public void assemble() {
        System.out.println("Baking the cookie");
    }

    @Override
    public void test() {
        System.out.println("Crunching the cookie");
    }

    public String getName() {
        return name;
    }
}
