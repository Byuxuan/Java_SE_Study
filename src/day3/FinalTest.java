package day3;

public class FinalTest {

    public static void main(String []args){

        D f=new F();
        f.output();
        //f.name="kkkk";

        People people=new People();
        //people.address=new Address();

        people.address.name="shanghai"; //而此时并没有改变address指向的对象，而是改变指向对象的属性


    }
}


class D{

    final String name="hahah";

    public final void  output(){
        System.out.println("D");
    }


}

class F extends D {  //不能被继承
    //  public void output(){
     //     System.out.println("F");
     // }
}

class Address{
    String name="beijing";
}

class People{
    final Address address=new Address(); //address必须指向最开始的地址

}