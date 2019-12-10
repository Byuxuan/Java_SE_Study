package day18;

import javax.xml.crypto.Data;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

@MyAnnocation(hello = "beijing",world = "shanghai")
public class OverrideTest {


    @MyAnnocation(hello = "tianjin",world = "shanghai")
    @Deprecated
    @SuppressWarnings("unchecked")
    public void method() {

        System.out.println("usage of annotation");
    }

    @Override
    public String toString() {
        return "This is OverrideTest";
    }

    @Deprecated
    public void doSomething() {
        System.out.println("do some thing");
    }


    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        OverrideTest test = new OverrideTest();
        System.out.println(test);
        test.doSomething();

        Date date = new Date();
        System.out.println(date.toLocaleString());

        Map map = new TreeMap();
        map.put("hello", new Date());
        System.out.println(map.get("hello"));

        System.out.println("------------");

        test.method();



    }
}
