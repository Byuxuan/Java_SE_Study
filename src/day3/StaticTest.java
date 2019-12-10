package day3;

public class StaticTest {
    public static void main(String[]args){
        MyStatic.a=5;

        MyStatic myStatic=new MyStatic();
        System.out.println(myStatic.a);
        MyStatic myStatic2=new MyStatic();
        myStatic.a=10;
        System.out.println(myStatic2.a);

        MyStatic2 myStatic3=new MyStatic2();
        myStatic3.output();

        MyStatic2.output();

        M m=new N();
        m.output();

        N n=new N();
        n.output();


    }
}


class MyStatic{
    static int a;
}

class MyStatic2{
    public  static void output(){
        System.out.println("output");
    }
}

class M{

    public static   void output(){
        System.out.println("M");
    }
}

class N extends M {

    //@Override
    public static   void output(){
        System.out.println("N");
    }
}