package testcommand;

public class ShutDownCommand implements Command {
    Receiver receiver;

    ShutDownCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.connect();
        receiver.shutdown();
        receiver.disconnect();
        System.out.println();
    }
}
