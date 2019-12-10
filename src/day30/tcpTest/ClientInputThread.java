package day30.tcpTest;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ClientInputThread extends Thread{

    private Socket socket;

    public ClientInputThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {

            while (true) {
                InputStream inputStream = socket.getInputStream();

                byte[] buffer = new byte[1024];

                int length = inputStream.read(buffer);

                String string = new String(buffer, 0, length);

                System.out.println(string);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
