package testfacade;

public class TestFacade {
    public static void main(String[] args) {
        SimpleProductFacade simpleProductFacade = new SimpleProductFacade();
        simpleProductFacade.setName("Testing");
        System.out.println(simpleProductFacade.getName());
    }
}
