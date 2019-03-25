package testmediator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Purchase {
    Mediator mediator;
    String response = "n";
    Purchase(Mediator mediator) {
        this.mediator = mediator;
    }

    public void go() {
        System.out.println("Buy the item now y/n ?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            response = in.readLine();
        }
        catch (IOException ioe) {
            System.err.println("IO Exception");
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        if(response.equalsIgnoreCase("y")) {
            System.out.println("Thanks for the purchase");
        }
        mediator.handle("purchase.exit");
    }
}
