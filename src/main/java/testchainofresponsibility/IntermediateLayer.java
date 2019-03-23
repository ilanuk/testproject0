package testchainofresponsibility;

public class IntermediateLayer implements HelpInterface {
    private HelpInterface successor;
    private final int INTERMEDIATE_HELP_LEVEL = 1;
    public IntermediateLayer(HelpInterface successor) {
        this.successor = successor;
    }


    @Override
    public void getHelp(int helpLevel) {
        if(helpLevel!= INTERMEDIATE_HELP_LEVEL) {
            successor.getHelp(helpLevel);
        }
        else {
            System.out.println("This is help from Intermediate layer");
        }
    }
}
