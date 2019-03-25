package testcommand;

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
}
