package day10;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class CollectionTest {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.add(new Integer(-8));
        linkedList.add(new Integer(20));
        linkedList.add(new Integer(-10));

        Comparator r= Collections.reverseOrder();  //返回一个逆序排列
        Collections.sort(linkedList, r);
        Collections.sort(linkedList);
        Collections.shuffle(linkedList);
        System.out.println("min is "+Collections.min(linkedList));  //也有重载方法
        System.out.println("max is "+Collections.max(linkedList));
        for (Object o : linkedList) {
            System.out.println(o);
        }
    }
}
