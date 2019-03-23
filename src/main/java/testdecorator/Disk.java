package testdecorator;

public class Disk extends ComponentDecorator {
    private Computer computer;

    Disk(Computer computer) {
        this.computer = computer;
    }
    @Override
    public String description() {
        return computer.description() + " and a disk";
    }
}
