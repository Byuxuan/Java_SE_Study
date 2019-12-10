package day11;

import java.util.*;

/**
 * 生成随机数字【10，50】,统计出现次数
 *
 */

public class Homework {

    public static void main(String[] args) {
        TreeMap treeMap=new TreeMap(new MyComparator());
        for (int i = 0; i <50 ; i++) {
            int key=(int) (Math.random()*41+10);
            if (treeMap.get(key)==null){
                treeMap.put(key, new Integer(1));

            }
            else {
                Integer value =(Integer) treeMap.get(key);
                value+=1;
                treeMap.put(key, value);
            }

        }

        Set set=treeMap.entrySet();
        for (Iterator iter=set.iterator();iter.hasNext();){
            Map.Entry entry = (Map.Entry) iter.next();
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

        Collection collections=treeMap.values();
        Integer max =(Integer) Collections.max(collections);
        System.out.println(max);
    }
}

class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Integer i1=(Integer) o1;
        Integer i2=(Integer) o2;

        if (i1>i2) return -1;   // 第一个值大于第二个值，返回1 为从小到大，反之为从大到小
        else  if (i1<i2) return 1;
        else return 0;
    }
}