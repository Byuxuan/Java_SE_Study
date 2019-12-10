package day25;

import java.io.*;

public class BufferStreamTest {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("E:/hello.txt");
        BufferedOutputStream bos = new BufferedOutputStream(os);

        bos.write("http://www.google.com".getBytes());
        bos.close();
        os.close();
    }
}
