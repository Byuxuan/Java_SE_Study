package day2;

public class Inheritance extends Parent {
    public Inheritance(){
        super(1);
        System.out.println("Child");
    }

    public static void main(String []args){
        //Inheritance child=new Inheritance();
        Fruit fruit=new Fruit();
        fruit.run();
        Apple apple2=new Apple();
        apple2.run();

        Fruit apple=new Apple();
        apple.run();
        //System.out.println(apple.name);

    }
}


class Parent{
    public Parent(int i){
        System.out.println("Parent");
    }



//    public Parent(){
//        System.out.println("no args Parent");
//    }

}

class Fruit{
    String name="fruit";

    public  void run(){

        System.out.println("friut run");
    }
}

class  Apple extends Fruit {
    String name="apple";
    public  void  run(){
        //super.run();
        System.out.println("apple is run");
    }

}