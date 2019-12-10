package day3;

public class InterfaceTest {
    public static void main(String []args){
        MyClass myClass=new MyClass();
        myClass.output();
    }

}

interface Myinterface{
    public void output();
}

interface Myinterface2{
    public void output2();

}

class Class{
   public void output3(){
       System.out.println("class");
   }
 }

class MyClass extends Class implements Myinterface, Myinterface2 {

    public void output(){
        System.out.println("Interface1");
    }
    public void output2(){
        System.out.println("Interface2");
    }
}
