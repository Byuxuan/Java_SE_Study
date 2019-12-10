package day2;

public class Overload {
    public int add(int a,int b){
        return a + b;
    }
    public double add(double a,double b){
        return a+b;
    }
    public Overload(){
        this(3);
        System.out.println("test");
    }
    public Overload(int i){
        System.out.println(++i);
    }


    public static void main(String []args){
        Overload Test=new Overload();
        Overload Test2=new Overload(3);
        int result=Test.add(1,2);
        double result2=Test.add(Test.add(1,2),Test.add(3,4));
        System.out.println(result2);

    }

}
