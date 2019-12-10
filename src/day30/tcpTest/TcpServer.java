package day30.tcpTest;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(5000);

        Socket socket2 = socket.accept();

        //System.out.println("Helloworld");

        InputStream inputStream = socket2.getInputStream();

        byte[] bytes = new byte[200];
        int length = inputStream.read(bytes);
        System.out.println(new String(bytes, 0, length));


//        int length=0;
//        while ((length = inputStream.read(bytes, 0, bytes.length)) != -1) {
//            String string = new String(bytes, 0, length);
//            System.out.println(string);
//        }

        OutputStream outputStream=socket2.getOutputStream();

        outputStream.write("welcome".getBytes());

        inputStream.close();
        outputStream.close();
        socket2.close();

    }
}
