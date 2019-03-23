package testobserverconcept1;

public class Editor implements Observer {
    @Override
    public void Update(String operation, String record) {
        System.out.println("Editor says database is performing " + operation + " on the " + record);
    }
}
