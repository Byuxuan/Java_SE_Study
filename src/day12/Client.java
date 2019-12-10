package day12;

import java.util.HashMap;
import java.util.HashSet;

public class Client {
    public static void main(String[] args) {
//        AddStrategy addStrategy=new AddStrategy();
//
//        Enviroment enviroment = new Enviroment(addStrategy);
//
//        System.out.println(enviroment.calculate(3,4));
//
//        SubStrategy subStrategy=new SubStrategy();
//
//        enviroment.setStrategy(subStrategy);
//
//        System.out.println(enviroment.calculate(4, 5));

        Person[] people = new Person[3];
        people[0] = new Person(1001, "aaa", 15);
        people[1] = new Person(1002, "bbb", 16);
        people[2] = new Person(1003, "ccc", 18);


        NamaSort namaSort=new NamaSort();
        namaSort.Sort(people,false);

        for (Person person : people) {
            System.out.println(person.getName());
        }

        AgeSort ageSort=new AgeSort();
        namaSort.Sort(people,false);

        for (Person person : people) {
            System.out.println(person.getAge());
        }

        HashSet hashSet = new HashSet();

        HashMap hashMap = new HashMap();

    }
}
