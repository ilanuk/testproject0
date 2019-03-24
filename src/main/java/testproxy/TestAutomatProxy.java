package testproxy;

public class TestAutomatProxy {
    public static void main(String[] args) {
        AutomateProxy automateProxy = new AutomateProxy();
        for (int i = 0; i < 10; i++) {
            automateProxy.gotApplication();
            automateProxy.checkApplication();
            automateProxy.rentApartment();
        }
    }
}
