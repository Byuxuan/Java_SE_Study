package day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {

        A.B b=new A.B();
        HashMap map=new HashMap();

        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
        map.put("D",4);


        // 遍历方法1
        Set set=map.entrySet();
        for(Iterator iterator=set.iterator();iterator.hasNext();){
            Map.Entry entry=(Map.Entry) iterator.next();
            String key=(String) entry.getKey();
            Integer value=(Integer) entry.getValue();
            System.out.println(key+":"+value);
        }

        // 遍历方法2
        Set set2 = map.keySet();
        for(Iterator iter = set2.iterator(); iter.hasNext();){
            String key=(String) iter.next();
            String value=(String) map.get(key);
            System.out.println(key+":"+value);
        }


    }
}

class A{
    static class B{

    }
}
