package day3;

public class Test {
    public static void main(String[]args){
        AA bb=new BB();
        bb.output();
    }
}

interface AA{
    public void output();
}

class BB implements AA {
    public void output(){
        System.out.println("BB");
    }

}