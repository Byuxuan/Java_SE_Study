package day15;

import java.util.*;


public class NewCharacter {
    public static void main(String[] args) {

        /**
         * 增强的for循环
         */
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        for (int i : arr) {
            System.out.println(i);
        }

        int [][]arr2={{1,2,3},{4,5,6}};
        for (int[] ints : arr2) {
            for (int anInt : ints) {

            }
        }


        Collection<String> col = new ArrayList<String>();
        for (String s : col) {
            System.out.println(s);
        }

        /**
         * 自动装箱，拆箱
         */

        int a=3;
        Collection<Integer> c = new ArrayList<Integer>();
        c.add(3); //自动装箱
        c.add(new Integer(3));


    }
}

class Frequency{
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<String, Integer>();
        for (String arg : args) {
            map.put(arg, (null == map.get(arg) ? 1 : map.get(arg) + 1));
        }
    }
}
