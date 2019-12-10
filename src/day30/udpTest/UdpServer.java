package day30.udpTest;



import java.io.IOException;
import java.net.*;

public class UdpServer {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();

        String string = "hello world";
        DatagramPacket sendpacket = new DatagramPacket(string.getBytes(),string.length(), InetAddress.getByName("localhost"),7000);

        datagramSocket.send(sendpacket);

        byte[] bytes = new byte[200];

        DatagramPacket receivepacket = new DatagramPacket(bytes, bytes.length);


        datagramSocket.receive(receivepacket);

        System.out.println(new String(bytes, 0, receivepacket.getLength()));

        datagramSocket.close();





    }
}
