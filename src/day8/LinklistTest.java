package day8;

import java.util.LinkedList;

public class LinklistTest {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.add("F");
        list.add("B");
        list.add("D");
        list.addLast("Z");
        list.addFirst("A");
        list.add(1,"A2");

        System.out.println(list);
        list.remove("F");
        list.remove(2);
        System.out.println(list);

        Object value = list.get(2);
        list.set(2, (String) value + "changed");
        System.out.println(list );







    }
}

