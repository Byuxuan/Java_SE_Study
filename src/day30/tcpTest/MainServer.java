package day30.tcpTest;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8000);

        while (true) {
            Socket socket=serverSocket.accept();
            new ServerInputThread(socket).start();
            new ServerOutputThread(socket).start();

            //启动读写线程
        }

    }
}
