package day2;

public class PolyTest {
    public static void  main(String []args){
//        Flower rose=new Rose(); //多态
//        Rose r=(Rose) rose;
//        rose.sing();
//
//        Flower s=new Sweet();
//        Sweet r2=(Sweet) s;
//
        Flower flower=new Flower();
        Flower flower2=new Rose();
//        flower2=flower;
//        flower2.sing();

//        flower=flower2;
//        flower.sing();
//
//        Rose r=new Rose();
//        Flower f=r;
//        f.sing();
//
//        Flower f2=new Flower();
//        Sweet s2= (Sweet) f2;  //编译不报错， 执行报错

        Flower f3=new Rose();
        f3.sing();
       // f3.run();  编译不通过

        Rose r3=(Rose) f3;
        r3.run();



    }
}


class Flower{
    public void  sing(){
        System.out.println("flower is singing");
    }

}

class  Rose extends Flower {
    public void  sing(){
        System.out.println("rose is singing");
    }
    public void run(){
        System.out.println("flower is runing");
    }

}

class  Sweet extends Flower {
    public void  sing(){
        System.out.println("Sweet is singing");
    }
}