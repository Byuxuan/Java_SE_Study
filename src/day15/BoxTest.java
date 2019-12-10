package day15;

public class BoxTest {
    public static void main(String[] args) {
        int x=200;
        Integer i1=x;
        Integer i2=x;
        if (i1.equals(i2)) System.out.println("i1==i2");
        else System.out.println("i1!=i2");
    }
}
