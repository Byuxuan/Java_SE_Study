package day25;

import java.io.*;

public class DataStreamTest {
    public static void main(String[] args) throws IOException {
        /**
         * FileOutputStream 节点流，可以直接和文件打交道
         * BufferdOutputStream 过滤流，
         * 综合起来就是可以以数据的形式带缓冲地写入文件,
         * 文件写入是二进制，无法直接打开
         */
        DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("E:/hello.txt")));

        byte b=3;
        int i=12;
        char ch = 'a';
        float f=3.3f;
        dataOutputStream.writeByte(b);
        dataOutputStream.writeInt(i);
        dataOutputStream.writeChar(ch);
        dataOutputStream.writeFloat(f);
        dataOutputStream.close();


        /**
         * 读写顺序保持一致
         */
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream("E:/hello.txt"));
        System.out.println(dataInputStream.readByte());
        System.out.println(dataInputStream.readInt());
        System.out.println(dataInputStream.readChar());
        System.out.println(dataInputStream.readFloat());

        dataInputStream.close();
    }
}
