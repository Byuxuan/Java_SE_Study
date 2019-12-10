package day19;

import java.lang.annotation.Inherited;

public class DocumentedTest {


    @DocumentedAnnotation(hello = "world")

    public void method(){
        System.out.println("hello world");
    }
}
