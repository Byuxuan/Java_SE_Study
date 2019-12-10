package day26.Stream;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderTest {
    public static void main(String[] args) throws IOException {
        String temp = "abcde";
        char[] chars = new char[temp.length()];

        temp.getChars(0, temp.length(), chars, 0);

        CharArrayReader input = new CharArrayReader(chars);
        int i;
        while ((i = input.read()) != -1) {
            System.out.println((char)i);
        }
    }
}
