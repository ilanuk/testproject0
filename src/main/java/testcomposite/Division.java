package testcomposite;

import java.util.Iterator;

public class Division extends Corporate {
    private String name;
    private Corporate[] corporates = new Corporate[100];
    private int counter = 0;

    public Division(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void add(Corporate c) {
        corporates[counter++] = c;
    }

    public DivisionIterator iterator() {
        return new DivisionIterator(corporates);
    }

    public void print() {
        Iterator iterator = iterator();
        while (iterator.hasNext()) {
            Corporate corporate = (Corporate) iterator.next();
            corporate.print();
        }
    }
}
