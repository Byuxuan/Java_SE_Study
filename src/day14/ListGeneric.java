package day14;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListGeneric<T extends List> {
    private T[] fooArray;



    public T[] getFooArray() {
        return fooArray;
    }

    public void setFooArray(T[] fooArray) {
        this.fooArray = fooArray;
    }

    public static void main(String[] args) {
        ListGeneric<LinkedList> foo1=new ListGeneric<LinkedList>();
        ListGeneric<ArrayList> foo2 = new ListGeneric<ArrayList>();
        foo1.setFooArray(new LinkedList[10]);

    }
}
