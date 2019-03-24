package testcomposite;

import java.util.Iterator;

public class VPIterator implements Iterator<VP> {
    private VP vp;

    public VPIterator(VP vp) {
        this.vp = vp;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public VP next() {
        return vp;
    }
}
