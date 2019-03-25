package testcommandundo;

public class USServer implements Receiver {
    @Override
    public void connect() {
        System.out.println("Connected to US server ...");
    }

    @Override
    public void diagnostics() {
        System.out.println("Diagnosed the US server to be OK");
    }

    @Override
    public void reboot() {
        System.out.println("Rebooted the US server ...");
    }

    @Override
    public void shutdown() {
        System.out.println("Shutdown the US server ...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected to US server ...");
    }
}
