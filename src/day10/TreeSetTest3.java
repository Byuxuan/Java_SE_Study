package day10;

import sun.plugin2.os.windows.SECURITY_ATTRIBUTES;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest3 {
    public static void main(String[] args) {
        TreeSet set=new TreeSet(new MyComparator());
        set.add("C");
        set.add("A");
        set.add("B");
        set.add("H");
        set.add("a");

        for(Iterator iterator=set.iterator();iterator.hasNext();){
            System.out.println(iterator.next());
        }
    }
}

class MyComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        String s1=(String) o1;
        String s2=(String) o2;
        return s2.compareTo(s1);
    }
}
