package day4;
import day3.PloyTest2;
import day3.ProtectedTest;

public class PackageTest extends ProtectedTest {

    public void output(){
        System.out.println(score);
    }
    public static void main(String[]args){
        PloyTest2 p=new PloyTest2();

        PackageTest P=new PackageTest();
        P.output();
        System.out.println(P instanceof PackageTest);
        System.out.println(P instanceof ProtectedTest);
        //System.out.println(P instanceof PolyTest);
    }


}
