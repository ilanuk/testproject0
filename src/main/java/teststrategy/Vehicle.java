package teststrategy;

public abstract class Vehicle {
    private GoStrategy goStrategy;

    public void go() {
        goStrategy.go();
    }

    public void setGoStrategy(GoStrategy goStrategy) {
        this.goStrategy = goStrategy;
    }
}
