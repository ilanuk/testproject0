package teststrategy;

public class Jet extends Vehicle {
    Jet() {
        setGoStrategy(new GoFlyingFastStrategy());
    }
}
