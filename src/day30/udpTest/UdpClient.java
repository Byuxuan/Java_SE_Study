package day30.udpTest;



import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpClient {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(7000);

        byte[] bytes = new byte[200];

        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);



        datagramSocket.receive(datagramPacket);

        System.out.println(new String(bytes, 0, bytes.length));

        String string = "welcome";
        DatagramPacket sendPacket = new DatagramPacket(string.getBytes(),0, string.length(), datagramPacket.getAddress(), datagramPacket.getPort());
        datagramSocket.send(sendPacket);

        datagramSocket.close();


    }
}
