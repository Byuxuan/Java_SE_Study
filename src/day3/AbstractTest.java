package day3;

public abstract class AbstractTest {

    public abstract void method();
    public static void main(String[]args){
       // AbstractTest a=new AbstractTest();



    }
}

abstract class T{
    public abstract void method();
}

abstract class R extends T {

//    public void method(){
//
//    }

}

class Y extends T {

    public void method(){

    }

}

abstract class X extends T {

    public void method(){

    }

}