package testdecorator;

public class Mouse extends ComponentDecorator {
    private Computer computer;

    Mouse(Computer computer) {
        this.computer = computer;
    }
    @Override
    public String description() {
        return computer.description() + " and a mouse";
    }
}
