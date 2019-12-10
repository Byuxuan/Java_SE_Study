package day16;

public class PrivateTest {

    private String name = "zhangsan";
    private String sayHello(String name){
        return "hello:"+name;
    }
    public String getName(){
        return name;
    }

}
