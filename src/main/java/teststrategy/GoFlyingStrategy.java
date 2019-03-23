package teststrategy;

public class GoFlyingStrategy implements GoStrategy {

    @Override
    public void go() {
        System.out.println("Now I am flying");
    }
}
