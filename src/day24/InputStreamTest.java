package day24;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamTest {
    public static void main(String[] args) throws IOException {

        /**
         * 输入流模板
         * step1 创建输入流
         * step2 定义缓存区
         * step3 定义读取长度
         * step4 当读取长度为-1表示该文件读取结束
         */
        FileInputStream fileInputStream = new FileInputStream("E:/hello.txt");
        byte[] buffer = new byte[200];
        int length=0; //每一次到底读了多少字节
        while ((length=fileInputStream.read(buffer,0,200))!=-1) {
            String string = new String(buffer,0,length);
            System.out.println(string);
        }

        fileInputStream.close();



    }



}
