package day30.tcpTest;

import java.io.*;
import java.net.Socket;

public class ServerOutputThread extends Thread {
    private Socket socket;

    public ServerOutputThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {

            while (true){
                OutputStream outputStream = socket.getOutputStream();

                BufferedReader reader = new BufferedReader(new InputStreamReader((System.in)));

                String line = reader.readLine();

                outputStream.write(line.getBytes());
            }




        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
