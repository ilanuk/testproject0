package teststrategy;

public class Car extends Vehicle {
    Car() {
        setGoStrategy(new GoDrivingStrategy());
    }
}
