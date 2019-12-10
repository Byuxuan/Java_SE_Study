package day19;


import java.lang.annotation.Target;


public class MyTatgetTest {

    @MyAnnotation(world = "shanghai", hello = "bai")
    public void doSomethin() {

        System.out.println("hello world");
    }
}
