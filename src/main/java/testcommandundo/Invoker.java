package testcommandundo;

public class Invoker {
    Command[] commands = new Command[5];
    int position;

    Invoker() {
        position = -1;
    }

    public void setCommand(Command command) {
        if(position < commands.length - 1) {
            position++;
            this.commands[position] = command;
        }
        else {
            for (int i = 0; i < (commands.length - 2); i++) {
                commands[i] = commands[i+1];
            }
            commands[commands.length - 1] = command;
        }
    }

    public void run() {
        commands[position].execute();
    }

    public void undo() {
        if(position >= 0) {
            commands[position].undo();
        }
        position--;
    }
}
