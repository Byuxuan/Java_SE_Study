package day30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlTest3 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.baidu.com");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));

        String line = null;

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

    }
}
