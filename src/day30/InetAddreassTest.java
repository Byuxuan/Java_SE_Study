package day30;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddreassTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();

        System.out.println(address);

        InetAddress address2 = InetAddress.getByName("www.souhu.com");
        System.out.println(address2);
    }
}
