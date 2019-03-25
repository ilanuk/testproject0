package testcommand;

public class Invoker {
    Command command;
    Invoker() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void run() {
        command.execute();
    }
}
