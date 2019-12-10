package day14;

import day12.Person;

import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("a");
        list.add("b");

        for (int i = 0; i <list.size() ; i++) {
            String value=list.get(i);
            System.out.println(value);
        }

        for(Iterator<String> integer = list.iterator(); integer.hasNext();){
            String value=integer.next();
            System.out.println(value);
        }

        Set<Integer> set=new TreeSet<Integer>();

        System.out.println("____________________");

        Set<People> set1=new HashSet<People>();
        set1.add(new People("zhangsan", 20, "beijing"));
        set1.add(new People("zhangsan", 20, "beijing"));
        set1.add(new People("lisi", 20, "shanghai"));
        set1.add(new People("zhangsan", 20, "chongqing"));
        for(Iterator<People> iterator=set1.iterator();iterator.hasNext();){
            People people=iterator.next();

            String name=people.getName();
            int age=people.getAge();
            String address=people.getAddress();
            System.out.println(name+":"+age+":"+address);
        }
    }
}


class People{
    private String name;
    private int age;
    private String address;

    public People(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
