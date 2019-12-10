package day25;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamTest {
    public static void main(String[] args) {
        String string = "abcdefg";
        byte[]bytes=string.getBytes();

        ByteArrayInputStream in = new ByteArrayInputStream(bytes);

        for (int i = 0; i <string.length() ; i++) {
            int c;
            while ((c = in.read()) != -1) {
                if (0 == i) {
                    System.out.println((char)c);
                }
                else {
                    System.out.println(Character.toUpperCase((char) c));

                }
                System.out.println();
                in.reset();
            }
        }
    }
}
