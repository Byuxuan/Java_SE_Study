package day30.tcpTest;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 5000);

        OutputStream outputStream = socket.getOutputStream();

        outputStream.write("hello world".getBytes());

        InputStream inputStream = socket.getInputStream();

        byte[] bytes = new byte[200];
        int length = inputStream.read(bytes);
        System.out.println(new String(bytes, 0, length));

//        byte[] bytes = new byte[200];
//        int length=0;
//        while ((length = inputStream.read(bytes, 0, bytes.length)) != -1) {
//            String string = new String(bytes, 0, length);
//            System.out.println(string);
//        }

        inputStream.close();
        outputStream.close();
        socket.close();




    }
}
