package day25;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamTest {
    public static void main(String[] args) throws IOException {
        //第二个参数决定是追加还是刷新

        OutputStream os = new FileOutputStream("E:/hello.txt",true);
        String string = "helloworld";
        byte []buffer=string.getBytes();
        os.write(buffer);
        os.close();
    }
}
