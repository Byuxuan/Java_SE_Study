package day25;

import java.io.*;

public class ByteArrayOutputStreamTest {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        String string = "abc";
        byte[] bytes=string.getBytes();

        outputStream.write(bytes);

        byte[] result=outputStream.toByteArray();

        for (int i = 0; i <result.length ; i++) {
            System.out.println((char) result[i]);
        }

        OutputStream os = new FileOutputStream("E:/hello.txt");

        outputStream.writeTo(os);

        outputStream.close();
        os.close();


    }
}
