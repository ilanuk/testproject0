package testcommand;

public class AsiaServer implements Receiver {
    @Override
    public void connect() {
        System.out.println("Connected to Asia server ...");
    }

    @Override
    public void diagnostics() {
        System.out.println("Diagnosed the Asia server to be OK");
    }

    @Override
    public void reboot() {
        System.out.println("Rebooted the Asia server ...");
    }

    @Override
    public void shutdown() {
        System.out.println("Shutdown the Asia server ...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected to Asia server ...");
    }
}
