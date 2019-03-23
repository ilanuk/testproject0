package testobserverconcept1;

import java.util.ArrayList;
import java.util.List;

public class Database implements Subject {

    List<Observer> observerList = new ArrayList<>();
    String operation;
    String record;

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o: observerList) {
            o.Update(operation, record);
        }
    }

    public void EditDatabase(String operation, String record) {
        this.operation = operation;
        this.record = record;
        notifyObservers();
    }
}
