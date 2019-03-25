package testcommandundo;

public class TestInvoker {
    public static void main(String[] args) {
        AsiaServer asiaServer = new AsiaServer();
        EuropseServer europeServer = new EuropseServer();
        USServer usServer = new USServer();

        ShutDownCommand asiaShutDownCommand = new ShutDownCommand(asiaServer);
        DiagnosticCommand asiaDiagnosticCommand = new DiagnosticCommand(asiaServer);
        RebootCommand asiaRebootCommand = new RebootCommand(asiaServer);

        ShutDownCommand europeShutDownCommand = new ShutDownCommand(europeServer);
        DiagnosticCommand europeDiagnosticCommand = new DiagnosticCommand(europeServer);
        RebootCommand europeRebootCommand = new RebootCommand(europeServer);

        ShutDownCommand usShutDownCommand = new ShutDownCommand(usServer);
        DiagnosticCommand usDiagnosticCommand = new DiagnosticCommand(usServer);
        RebootCommand usRebootCommand = new RebootCommand(usServer);

        Invoker invoker = new Invoker();

        invoker.setCommand(asiaShutDownCommand);
        invoker.run();

        invoker.setCommand(asiaRebootCommand);
        invoker.run();

        invoker.setCommand(asiaDiagnosticCommand);
        invoker.run();

        invoker.undo();
        invoker.undo();
        invoker.undo();

        invoker.setCommand(europeShutDownCommand);
        invoker.run();

        invoker.setCommand(europeRebootCommand);
        invoker.run();

        invoker.setCommand(europeDiagnosticCommand);
        invoker.run();

        invoker.undo();
        invoker.undo();

        invoker.setCommand(usShutDownCommand);
        invoker.run();

        invoker.setCommand(usRebootCommand);
        invoker.run();

        invoker.setCommand(usDiagnosticCommand);
        invoker.run();

        invoker.undo();
        invoker.undo();
        invoker.undo();
        invoker.undo();



    }
}
