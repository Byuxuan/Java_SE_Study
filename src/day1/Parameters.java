package day1;


public class Parameters {
    public static  void  main(String []args){
        Person person=new Person();
        person.change(person);
        int age=person.age;
        System.out.println(age);

        int i=10;
        person.change2(i);

        System.out.println(i);
        int a=3,b=4;



    }
}

class  Person{
    int age=20;
    public void change(Person person){
        person.age=30;
    }
    public void change2(int age){
        age=40;
    }
    public Person(){
        //默认构造方法
    }
}