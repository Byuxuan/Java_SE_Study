package day26.Stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("D:\\IdeaProjects\\Java SE Study2\\src\\day26\\Stream\\FileReaderTest.java");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String string;
        while ((string = bufferedReader.readLine()) != null) {
            System.out.println(string);
        }

        bufferedReader.close();
    }
}
