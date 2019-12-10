package day24;

import java.io.File;
import java.io.IOException;

public class FileTest1 {
    public static void main(String[] args) throws IOException {
        File file = new File("E:/abc.txt");
        File file2 = new File(new File("E:/abc"),"hello.txt");
        System.out.println(file2.createNewFile());

    }
}
