package testcommand;

public class RebootCommand implements Command {
    Receiver receiver;

    RebootCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.connect();
        receiver.reboot();
        receiver.disconnect();
        System.out.println();
    }
}
