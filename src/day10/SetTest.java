package day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class SetTest {
    public static void main(String[] args) {
        HashSet hashSet=new HashSet();

        hashSet.add("a");
        hashSet.add("d");
        hashSet.add("b");
        hashSet.add("c");
        System.out.println(hashSet);

        HashSet peopleSet=new HashSet();
        peopleSet.add(new People("zhangsan"));
        peopleSet.add(new People("lisi"));
        peopleSet.add(new People("zhangsan"));  //可以添加成功
        System.out.println(peopleSet);




        People p1 = new People("yanliu");
        HashSet peopleSet2=new HashSet();
        peopleSet2.add(p1);
        peopleSet2.add(p1); // p1.equals(p1) 为ture ,所以不能添加成功
        System.out.println(peopleSet2); //



        String s1=new String("a");
        String s2=new String("a");
        HashSet set=new HashSet();
        set.add(s1);
        set.add(s2); //重写了hashcode值，s1.equals(s2)返回true
        System.out.println(set);

        HashSet stuSet=new HashSet();

        Student st1 = new Student("zhangsan");
        Student st2 = new Student("zhangsan");
        stuSet.add(st1);
        stuSet.add(st2);
        System.out.println(stuSet);


        Iterator iterator=hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println((String) iterator.next());
        }

        for(Iterator iter=hashSet.iterator();iter.hasNext();){
            System.out.println(iter.next());
        }









    }
}

class People{
    String name;

    public People(String name) {
        this.name = name;
    }
}

class Student{
    String name;

    public Student(String name) {
        this.name = name;
    }

//    public int hashCode(){
//        return this.name.hashCode();
//    }
//    public boolean equals(Object obj){ //重写hashcode
//        if (this==obj) return true;
//        if (null !=obj && obj instanceof Student){
//            Student s=(Student) obj;
//            if (name.equals(s.name)) return true;
//        }
//        return  false;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
