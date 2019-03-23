package teststrategy;

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle jet = new Jet();
        jet.setGoStrategy(new GoDrivingStrategy());
        Vehicle helicopter = new Helicopter();
        car.go();
        jet.go();
        jet.setGoStrategy(new GoFlyingFastStrategy());
        jet.go();
        jet.setGoStrategy(new GoDrivingStrategy());
        jet.go();
        helicopter.go();
    }
}
