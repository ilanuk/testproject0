package testobserverconcept1;

public class Archiver implements Observer {
    @Override
    public void Update(String operation, String record) {
        System.out.println("Archiver says database is performing " + operation + " on the " + record);
    }
}
