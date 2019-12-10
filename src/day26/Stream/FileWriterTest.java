package day26.Stream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("E:/hello.txt");
        String string = "hello world welcome ";

        char[] buffer = new char[string.length()];

        string.getChars(0, string.length(), buffer, 0);

        for (char c : buffer) {
            fileWriter.write(c);
        }
        fileWriter.close();


    }


}
