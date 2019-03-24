package teststate;

import java.util.Random;

public class GotApplicationState implements State {
    AutomateInterface automate;
    Random random;
    public GotApplicationState(AutomateInterface automate) {
        this.automate = automate;
        random = new Random(System.currentTimeMillis());
    }

    @Override
    public String gotApplication() {
        return "We already got your application";
    }

    @Override
    public String checkApplication() {
        int yesno = random.nextInt()% 10;
        if (yesno > 4 && automate.getCount() > 0 ) {
            automate.setState(automate.getApartementRentedState());
            return "Congratulations, you are approved";
        }
        else {
            automate.setState(automate.getWaitingState());
            return "Sorry, you are not approved";
        }
    }

    @Override
    public String rentApartment() {
        return "You must have your application checked";
    }

    @Override
    public String dispenseKeys() {
        return "You must have your application checked";
    }
}
