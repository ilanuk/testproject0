package testmediator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Shop {
    Mediator mediator;
    String response = "n";
    Shop(Mediator mediator) {
        this.mediator = mediator;
    }

    public void go() {
        System.out.println("Do you want to purchase y/n ?");
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
            mediator.handle("shop.purchase");
        }
        else {
            mediator.handle("shop.exit");
        }
    }
}
