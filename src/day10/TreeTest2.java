package day10;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeTest2 {
    public static void main(String[] args) {
        TreeSet set =new TreeSet(new MyComparator2());
        Person p1=new Person(30);
        Person p2 = new Person(10);
        Person p3 = new Person(20);
        set.add(p1);
        set.add(p2);
        set.add(p3);

        for(Iterator inter=set.iterator();inter.hasNext();){
            Person p = (Person) inter.next();
            System.out.println(p.score);
        }

    }
}

class Person {
    int score;

    public Person(int score) {
        this.score = score;
    }
    public String toString(){
        return String.valueOf(this.score);
    }

}
class MyComparator2 implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Person person1=(Person) o1;
        Person person2=(Person) o2;
        if (person1.score>person2.score) return 1;
        else if(person1.score<person2.score) return -1;
        else return 0;
    }
}

