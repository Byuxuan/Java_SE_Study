package day26.Stream;

import java.io.*;

public class StreamTest {

    public static void main(String[] args) throws IOException{
        FileOutputStream fileOutputStream = new FileOutputStream("E:/hello.txt");

        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);

        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        bufferedWriter.write("http:www.google.com");
        bufferedWriter.write("\n");
        bufferedWriter.write("http:www.google.com");

        bufferedWriter.close();

        FileInputStream fileInputStream = new FileInputStream("E:/hello.txt");

        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


        String str = bufferedReader.readLine();
        while (str!=null){
            System.out.println(str);
            str=bufferedReader.readLine();
        }

        bufferedReader.close();







    }
}
