package testproxy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class AutomateServer implements Runnable, AutomateInterface {
    State waitingState;
    State gotApplicationState;
    State apartmentRentedState;
    State fullyRentedState;
    State state;
    int count;
    private Thread thread;
    ServerSocket socket;
    PrintWriter out;
    Socket communicationSocket;

    public AutomateServer(int count) {
        this.count = count;
        waitingState = new WaitingState(this);
        gotApplicationState = new GotApplicationState(this);
        apartmentRentedState = new ApartmentRentedState(this);
        fullyRentedState = new FullyRentedState(this);
        state = waitingState;
        try {
            socket = new ServerSocket(8765);
            communicationSocket = socket.accept();
            out = new PrintWriter(communicationSocket.getOutputStream(),true);
            thread = new Thread(this);
            thread.start();
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        AutomateServer automateServer = new AutomateServer(10);
    }

    @Override
    public void gotApplication() {
        out.println(state.gotApplication());
    }

    @Override
    public void checkApplication() {
        out.println(state.checkApplication());
    }

    @Override
    public void rentApartment() {
        out.println(state.rentApartment());
        out.println(state.dispenseKeys());
    }

    @Override
    public void setState(State s) {
        this.state = s;
    }

    @Override
    public State getWaitingState() {
        return waitingState;
    }

    @Override
    public State getGotApplicationState() {
        return gotApplicationState;
    }

    @Override
    public State getApartementRentedState() {
        return apartmentRentedState;
    }

    @Override
    public State getFullyRentedState() {
        return fullyRentedState;
    }

    @Override
    public void setCount(int n) {
        this.count = n;
    }

    @Override
    public int getCount() {
        return this.count;
    }

    @Override
    public void run() {
        String incomingString;
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(communicationSocket.getInputStream()));
            while((incomingString = in.readLine())!= null) {
                if(incomingString.equalsIgnoreCase("gotApplication")) {
                    gotApplication();
                }
                else if(incomingString.equalsIgnoreCase("checkApplication")) {
                    checkApplication();
                }
                else if(incomingString.equalsIgnoreCase("rentApartment")) {
                    rentApartment();
                }
            }
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
