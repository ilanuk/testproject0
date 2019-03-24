package testproxy;

public interface AutomateInterface {
    public void gotApplication();
    public void checkApplication();
    public void rentApartment();
    public void setState(State s);
    public State getWaitingState();
    public State getGotApplicationState();
    public State getApartementRentedState();
    public State getFullyRentedState();
    public void setCount(int n);
    public int getCount();
}
