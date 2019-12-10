package day10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        HashMap map=new HashMap();
        map.put("A", "zhangsan");
        map.put("B", "lisi");
        map.put("C", "wangwu");

        System.out.println(map);
        map.put("A", "zhaoliu");
        System.out.println(map);

        System.out.println((String) map.get("B"));
        System.out.println(map.get("D "));

        Set set = map.keySet();
        for(Iterator iter = set.iterator(); iter.hasNext();){
            String key=(String) iter.next();
            String value=(String) map.get(key);
            System.out.println(key+":"+value);
        }







    }




}
