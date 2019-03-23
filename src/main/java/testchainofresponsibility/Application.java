package testchainofresponsibility;

public class Application implements HelpInterface{

    Application() {

    }

    @Override
    public void getHelp(int helpLevel) {
        System.out.println("This is help from Application");
    }
}
