package day4;

public class StacticCode {
    public static void main(String[]args){
//        R r=new R();
////        R r1=new R();

        new S();
        new S();
        W w=new W();
        w.change();
    }
}


class R{

    public R(){
        System.out.println("R constructor");
    }
    static {
        System.out.println("R Static block");
    }

}

class Q extends R {
    static {
        System.out.println("Q static block");
    }
    public Q(){
        System.out.println("Q constrctor");
    }
}

class S extends Q {
    static {
        System.out.println("S static block");
    }
    public S(){
        System.out.println("S constrctor");
    }
}

class  W{
    //int a=10;
    static int a=10;
    public static void change(){
        //a++;  不知道改变的是哪一个对象的a
        a++;
        //this.a++;
    }
}