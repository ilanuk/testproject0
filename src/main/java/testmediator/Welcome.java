package testmediator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Welcome {
    Mediator mediator;
    String response = "n";
    Welcome(Mediator mediator) {
        this.mediator = mediator;
    }

    public void go() {
        System.out.println("Do you want to shop y/n ?");
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
            mediator.handle("welcome.shop");
        }
        else {
            mediator.handle("welcome.exit");
        }
    }
}
