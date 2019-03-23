package testtemplate;

public class TestTemplate {
    public static void main(String[] args) {
        AutomotiveRobot automotiveRobot = new AutomotiveRobot("Automotive");
        System.out.println(automotiveRobot.getName());
        automotiveRobot.go();

        System.out.println("---------------------------------------------");
        CookieRobot cookieRobot = new CookieRobot("Cookie");
        System.out.println(cookieRobot.getName());
        cookieRobot.go();

    }
}
