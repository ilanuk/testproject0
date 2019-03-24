package testproxy;

public class FullyRentedState implements State {
    AutomateInterface automate;
    public FullyRentedState(AutomateInterface automate) {
        this.automate = automate;
    }

    @Override
    public String gotApplication() {
        return "Sorry, we are fully rented";
    }

    @Override
    public String checkApplication() {
        return "Sorry, we are fully rented";
    }

    @Override
    public String rentApartment() {
        return "Sorry, we are fully rented";
    }

    @Override
    public String dispenseKeys() {
        return "Sorry, we are fully rented";
    }

}
