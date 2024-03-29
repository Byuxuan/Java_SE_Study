package day26.CharSetTest;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;

public class CharSetTest {
    public static void main(String[] args) {
        SortedMap<String, Charset> map=Charset.availableCharsets();

        Set<String> set=map.keySet();

        for(Iterator<String> iterator=set.iterator();iterator.hasNext();){
            System.out.println(iterator.next());
        }
    }
}
