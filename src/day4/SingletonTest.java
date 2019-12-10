package day4;

public class SingletonTest {

    public static void main(String[]args){
        Singleton singleton= Singleton.getInstance();
        Singleton singleton2= Singleton.getInstance();

        System.out.println(singleton==singleton2);

    }
}

class Singleton{

    //private static Singleton singleton=new Singleton();
    /**
     * Method2
     */
    private static Singleton singleton;   //由于方法是static只能对static属性进行操作
    private Singleton(){   //防止外部类创建新的实例

    }
    public static Singleton getInstance(){  //为了让其他类可以直接调用
        if (singleton==null){ //多线程中有问题
            singleton=new Singleton();
        }
        return singleton;
    }

    /**
     * Method1
     */
//    private static Singleton singleton=new Singleton();
//    private  Singleton(){
//
//    }
//    return singleton;
}