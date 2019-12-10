package day24;

import java.io.File;

public class FileDeleteTest {

    public static void deleteAll(File file) {
        if (file.isFile() || file.list().length == 0) {
            file.delete();
        }
        else {
            File []files=file.listFiles();
            for (File file1 : files) {
                deleteAll(file1);
                file1.delete();
            }
        }
    }

    public static void main(String[] args) {
        FileDeleteTest.deleteAll(new File("E:/abc"));

    }
}
