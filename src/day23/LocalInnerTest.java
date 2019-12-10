package day23;

public class LocalInnerTest {



    public void doSomething(){
        int anInt=4;
        class Inner3{

            public void test(){
                //anInt=5;
                System.out.println(anInt);
            }
        }
        new Inner3().test();
    }

    public static void main(String[] args) {
        LocalInnerTest localInnerTest=new LocalInnerTest();
        localInnerTest.doSomething();
    }
}
