package testcommand;

public class EuropseServer implements Receiver {
    @Override
    public void connect() {
        System.out.println("Connected to Europe server ...");
    }

    @Override
    public void diagnostics() {
        System.out.println("Diagnosed the Europe server to be OK");
    }

    @Override
    public void reboot() {
        System.out.println("Rebooted the Europe server ...");
    }

    @Override
    public void shutdown() {
        System.out.println("Shutdown the Europe server ...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected to Europe server ...");
    }
}
