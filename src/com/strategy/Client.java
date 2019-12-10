package com.strategy;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.setName("Tom");
        p1.setId(1);
        p1.setAge(10);

        Person p2=new Person();
        p2.setName("Tom");
        p2.setId(2);
        p2.setAge(20);


        Person p3=new Person();
        p3.setName("Joe");
        p3.setId(4);
        p3.setAge(20);



        Person p4=new Person();
        p4.setName("Hel");
        p4.setId(3);
        p4.setAge(10);

        Person p5=new Person();
        p5.setName("AAA");
        p5.setId(5);
        p5.setAge(10);


        List<Person> list=new ArrayList<Person>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);

        UpNameSort upNameSort=new UpNameSort();
        Enviroment enviroment = new Enviroment(upNameSort);

        enviroment.sort(list);

        for (Person person : list) {
            System.out.println(person.getId() + ":" + person.getName() + ":" + person.getAge());

        }

        DownNameSort downNameSort=new DownNameSort();
        enviroment.setSortInterface(downNameSort);
        enviroment.sort(list);

        System.out.println("-----------");

        for (Person person : list) {
            System.out.println(person.getId() + ":" + person.getName() + ":" + person.getAge());

        }
    }

}
