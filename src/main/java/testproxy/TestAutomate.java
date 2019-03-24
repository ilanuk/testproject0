package testproxy;

public class TestAutomate {
    public static void main(String[] args) {
        AutomateInterface automate = new Automate(10);
        for (int i = 0; i < 10 ; i++) {
            automate.gotApplication();
            automate.checkApplication();
            automate.rentApartment();
        }
    }
}
