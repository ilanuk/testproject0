package testiterator;


import java.util.Iterator;

public class DivisionIterator implements Iterator<VP> {

    private VP[] vps;
    private int location = 0;

    DivisionIterator(VP[] vps) {
        this.vps = vps;
    }

    @Override
    public boolean hasNext() {
        if(location < vps.length && vps[location] != null) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public VP next() {
        return vps[location++];
    }

    @Override
    public void remove() {

    }
}
