package testcommandundo;

public class DiagnosticCommand implements Command {
    Receiver receiver;

    DiagnosticCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.connect();
        receiver.diagnostics();
        receiver.disconnect();
        System.out.println();
    }

    @Override
    public void undo() {
        System.out.println("Sorry, you cannot undo diagnostic.");
        System.out.println();
    }
}
