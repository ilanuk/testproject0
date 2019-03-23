package testdecorator;

public class Monitor extends ComponentDecorator {
    private Computer computer;


    Monitor(Computer computer) {
        this.computer = computer;
    }
    @Override
    public String description() {
        return computer.description() + " and a monitor";
    }
}
