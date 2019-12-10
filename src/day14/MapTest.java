package day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "aa");
        map.put("b", "bb");
        map.put("c", "cc");

        Set<String> set=map.keySet();
        for(Iterator<String> iterator=set.iterator();iterator.hasNext();){
            String key=iterator.next();
            String value = map.get(key);

        }
        System.out.println("-----------------------");
        Set<Map.Entry<String,String>> entrySet=map.entrySet(); //map.entrySet返回一个Set对象，S
        // Set里面是Map.Entry;

        for(Iterator<Map.Entry<String,String>>iterator=entrySet.iterator();iterator.hasNext();){
            Map.Entry<String,String> entry=iterator.next();

            String key=entry.getKey();
            String value=entry.getValue();



        }


    }
}
