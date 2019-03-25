package testmediator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exit {
    Mediator mediator;
    String response = "n";
    Exit(Mediator mediator) {
        this.mediator = mediator;
    }

    public void go() {
        System.out.println("Thanks for your visit. Come again.");
    }
}
