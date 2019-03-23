package testobserverconcept1;

public class Boss implements Observer {
    @Override
    public void Update(String operation, String record) {
        System.out.println("Boss says database is performing " + operation + " on the " + record);
    }
}
