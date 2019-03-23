package testtemplate;

public abstract class RobotTemplate {

    public final void go() {
        start();
        getParts();
        assemble();
        test();
        stop();
    }

    public void start() {
        System.out.println("Starting the process");
    }
    public void getParts() {
        System.out.println("Getting the parts for the product");
    }
    public void assemble() {
        System.out.println("Assembling the product");
    }
    public void test() {
        System.out.println("Testing the assembled product");
    }
    public void stop() {
        System.out.println("Stopping the process");
    }



}
