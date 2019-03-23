package teststrategy;

public class Helicopter extends Vehicle {
    Helicopter() {
        setGoStrategy(new GoFlyingStrategy());
    }
}
