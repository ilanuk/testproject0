package testobserver;

import java.util.Observable;
import java.util.Observer;

public class Archiver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("The archiver says a " +
                ((Database)o).getOperation() + " was performed on a " +
                ((Database)o).getRecord());
    }
}
