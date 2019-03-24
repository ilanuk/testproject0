package testproxy;

public class WaitingState implements State {
    AutomateInterface automate;
    public WaitingState(AutomateInterface automate) {
        this.automate = automate;
    }

    @Override
    public String gotApplication() {
        automate.setState(automate.getGotApplicationState());
        return "Thanks for the application";
    }

    @Override
    public String checkApplication() {
        return "You have to submit the application";
    }

    @Override
    public String rentApartment() {
        return "You have to submit the application";
    }

    @Override
    public String dispenseKeys() {
        return "You have to submit the application";
    }
}
