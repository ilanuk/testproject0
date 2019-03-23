package testobserver;

import java.util.Observable;
import java.util.Observer;

public class Boss implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("The boss says a " +
                ((Database)o).getOperation() + " was performed on a " +
                ((Database)o).getRecord());
    }
}
