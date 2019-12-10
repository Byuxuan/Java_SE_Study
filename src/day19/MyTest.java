package day19;

@MyAnnotation(hello = "beijing", world = "shanghai")
public class MyTest {

    @MyAnnotation(hello = "tianjing", world = "shanghai")
    @Deprecated
    @SuppressWarnings("unchecked")
    public void output(){
        System.out.println("output Something");
    }

    @MyAnnotation(hello = "taiyuan", world = "shanghai")
    @Deprecated
    @SuppressWarnings("unchecked")
    public void input(){
        System.out.println("input Something");
    }
}
