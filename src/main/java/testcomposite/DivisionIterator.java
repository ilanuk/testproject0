package testcomposite;

import java.util.Iterator;

public class DivisionIterator<Corporate> implements Iterator<Corporate> {
    private final Corporate[] corporates;
    private int location = 0;

    DivisionIterator(Corporate[] corporates) {
        this.corporates = corporates;
    }
    @Override
    public boolean hasNext() {
        if(location < corporates.length && corporates[location]!=null) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public Corporate next() {
        return corporates[location++];
    }
}
