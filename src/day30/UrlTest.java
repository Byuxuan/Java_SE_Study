package day30;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlTest {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.baidu.com");

        String protocal = url.getProtocol();

        String host = url.getHost();

        String file = url.getFile();

        int port = url.getPort();

        String ref = url.getRef();

        System.out.println(protocal+"   "+host+"   "+file+"   "+port+"   "+ref);

        URLConnection urlConnection = url.openConnection();

        InputStream inputStream = urlConnection.getInputStream();
        OutputStream outputStream = new FileOutputStream("E:/hello.txt");
        byte[] bytes = new byte[2048];

        int length=0;
        while ((length = inputStream.read(bytes, 0, bytes.length)) != -1) {
            outputStream.write(bytes, 0, bytes.length);
        }
        inputStream.close();
        outputStream.close();
    }
}
