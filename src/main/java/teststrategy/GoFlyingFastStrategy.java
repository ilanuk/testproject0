package teststrategy;

public class GoFlyingFastStrategy implements GoStrategy {

    @Override
    public void go() {
        System.out.println("Now I am flying fast");
    }
}
