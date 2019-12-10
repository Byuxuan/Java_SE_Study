package day30.tcpTest;

import java.io.IOException;
import java.net.Socket;

public class MainClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8000);

        new ClientInputThread(socket).start();
        new ClientOutputThread(socket).start();


        Socket socket2 = new Socket("localhost", 8000);

        new ClientInputThread(socket2).start();
        new ClientOutputThread(socket2).start();

    }
}
