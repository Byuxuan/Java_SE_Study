package day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Set;

public class day11 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String str;
        HashMap map=new HashMap();
        do {
               str = bufferedReader.readLine();
               Set set=map.keySet();
               boolean Flag = set.contains(str);
               if (Flag){
                   Integer value =(Integer) map.get(str);
                   value+=1;
                   map.put(str, value);
               }
               else {
                   if (str.equals("#")) break;
                   Integer value=1;
                   map.put(str, value);
               }

        } while (!str.equals("#"));

        System.out.println(map);

    }
}
