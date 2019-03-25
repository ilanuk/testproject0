package testmediator;

import testcommandundo.ShutDownCommand;

public class Mediator {
    private Welcome welcome;
    private Shop shop;
    private Purchase purchase;
    private Exit exit;
    Mediator() {
        welcome = new Welcome(this);
        shop = new Shop(this);
        purchase = new Purchase(this);
        exit = new Exit(this);
    }
    public void handle(String s) {
        switch (s) {
            case "welcome.exit":
            case "shop.exit":
            case "purchase.exit":
                exit.go();
                break;
            case "welcome.shop":
                shop.go();
                break;
            case "shop.purchase":
                purchase.go();
                break;
        }
    }

    public Welcome getWelcome() {
        return this.welcome;
    }
}
