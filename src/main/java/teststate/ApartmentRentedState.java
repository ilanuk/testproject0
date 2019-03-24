package teststate;

public class ApartmentRentedState implements State {
    AutomateInterface automate;
    public ApartmentRentedState(AutomateInterface automate) {
        this.automate = automate;
    }

    @Override
    public String gotApplication() {
        return "Hang on, we are renting you an apartment ";
    }

    @Override
    public String checkApplication() {
        return "Hang on, we are renting you an apartment ";
    }

    @Override
    public String rentApartment() {
        automate.setCount(automate.getCount() - 1);
        return "Renting you an apartment";
    }

    @Override
    public String dispenseKeys() {
        if(automate.getCount() <= 0) {
            automate.setState(automate.getFullyRentedState());
        }
        else {
            automate.setState(automate.getWaitingState());
        }
        return "Here are your keys";
    }

}
