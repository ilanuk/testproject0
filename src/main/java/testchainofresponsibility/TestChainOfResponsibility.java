package testchainofresponsibility;

public class TestChainOfResponsibility {
    public static void main(String[] args) {
        int APPLICATION_LEVEL_HELP = 0;
        int INTERMEDIATE_LEVEL_HELP = 1;
        int FRONTEND_HELP = 2;

        Application application = new Application();
        IntermediateLayer intermediateLayer = new IntermediateLayer(application);
        FrontEnd frontEnd = new FrontEnd(intermediateLayer);

        frontEnd.getHelp(APPLICATION_LEVEL_HELP);
    }
}
