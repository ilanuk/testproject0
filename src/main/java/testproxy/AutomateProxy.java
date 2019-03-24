package testproxy;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class AutomateProxy implements Runnable {
    private Thread thread;
    Socket socket;
    InputStream in;
    PrintWriter out;
    int character;
    public AutomateProxy() {
        try {
            socket = new Socket("127.0.0.1", 8765);
            System.out.println("Connecting ....");
            in = socket.getInputStream();
            out = new PrintWriter(socket.getOutputStream(),true);
            thread = new Thread(this);
            thread.start();
        }
        catch (IOException ioe) {
            System.err.println("The server must be running");
            System.err.println("Not connected");
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }

        if(socket!=null && socket.isConnected()) {
            System.out.println("Connected");
        }
    }
    @Override
    public void run() {
        try {
            while ((character = in.read()) != -1) {
                System.out.print((char)character);
            }
            System.out.println();
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public void gotApplication() {
        out.println("gotApplication");
    }

    public void checkApplication() {
        out.println("checkApplication");
    }


    public void rentApartment() {
        out.println("rentApartment");
    }

}
