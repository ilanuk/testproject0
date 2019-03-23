package testchainofresponsibility;

public class FrontEnd implements HelpInterface {
    private HelpInterface successor;
    private final int FRONTEND_HELP_LEVEL = 2;
    public FrontEnd(HelpInterface successor) {
        this.successor = successor;
    }


    @Override
    public void getHelp(int helpLevel) {
        if(helpLevel!= FRONTEND_HELP_LEVEL) {
            successor.getHelp(helpLevel);
        }
        else {
            System.out.println("This is help from Front End");
        }
    }
}
