package testobserver;

import java.util.Observable;

public class Database extends Observable {
    public String operation;
    public String record;

    public void editRecord(String operation, String record) {
        this.operation = operation;
        this.record = record;
        setChanged();
        notifyObservers();
    }

    public String getOperation() {
        return operation;
    }

    public String getRecord() {
        return record;
    }
}
