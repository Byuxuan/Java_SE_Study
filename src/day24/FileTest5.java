package day24;

import java.io.File;
import java.io.IOException;

public class FileTest5 {
    public static void main(String[] args) throws IOException {
        File file = new File("E:" + File.separator + "hello.txt");
        file.createNewFile();

    }
}
