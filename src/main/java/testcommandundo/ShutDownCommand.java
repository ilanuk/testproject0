package testcommandundo;

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

    @Override
    public void undo() {
        System.out.println("Undoing the shutdown");
        receiver.connect();
        receiver.reboot();
        receiver.disconnect();
        System.out.println();
    }
}
