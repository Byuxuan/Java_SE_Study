package day3;

public class PloyTest2 {

    public void run(BMW bmw){
        bmw.run();
    }
    public void run(QQ qq){
        qq.run();
    }  //方法重写

    public void run(Car car){
        car.run();
    }  //




    public static void main(String []args){

//        A a=null;
//        if(args[0].equals("1")){
//            a=new B();
//        }
//        else if (args[0].equals("2")){
//            a=new C();
//        }
//        a.method();

        PloyTest2 p=new PloyTest2();
        BMW bmw=new BMW();
        p.run(bmw);

        Car c=new BMW();
        p.run(c);

        Car qq=new QQ();
        p.run(qq);









    }

}

class A{
    public void method(){
        System.out.println("A");
    }
}

class B extends A {
    public void method(){
        System.out.println("B");
    }
}

class C extends A {
    public void method(){
        System.out.println("C");
    }

}

class Car{
    public void run(){
        System.out.println("Car is runing");
    }
}

class  BMW extends Car {
    public void run(){
        System.out.println("BMW is runing");
    }

}

class QQ extends Car {
    public void run(){
        System.out.println("QQ is runing");
    }
}