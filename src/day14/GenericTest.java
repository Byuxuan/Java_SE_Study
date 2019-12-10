package day14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericTest<T> {
    private T foo;

    public T getFoo() {
        return foo;
    }

    public void setFoo(T foo) {
        this.foo = foo;
    }

    public static void main(String[] args) {
        GenericTest<? extends List> genericTest=null;
        genericTest=new GenericTest<ArrayList>();
        genericTest = new GenericTest<LinkedList>();

        GenericTest<? super List> genericTest1=null;
        //genericTest1=new GenericTest<ArrayList>();

        GenericTest<String> genericTest3=new GenericTest<String>();
        genericTest3.setFoo("hello world");

        GenericTest<? extends Object> genericTest2=genericTest3;

        System.out.println(genericTest2.getFoo());

        genericTest2.setFoo(null);

        //genericTest2.setFoo("hahah");
    }
}
