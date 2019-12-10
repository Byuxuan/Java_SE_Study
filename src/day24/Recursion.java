package day24;

public class Recursion {

    public int compute(int number){
        if (number==1) return number;

        return number * compute(number-1);
    }

    public static void main(String[] args) {
        Recursion recursion=new Recursion();
        int result= recursion.compute(5);
        System.out.println(result);
    }
}
