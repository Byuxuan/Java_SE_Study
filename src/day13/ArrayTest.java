package day13;

import day8.ArrayListTest;

import java.util.ArrayList;
import java.util.List;

public class ArrayTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("string");
        list.add(new Integer(2));
        list.add(new Boolean(false));

        String str = (String) list.get(0);
        Integer integer = (Integer) list.get(1);
        Boolean b = (Boolean) list.get(2);



    }
}
