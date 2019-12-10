package day9;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.ArrayList;
import java.util.LinkedList;

public class Homework {

    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        arrayList.add("welcome");
        LinkedList linkedList=new LinkedList();
        Queue queue =new Queue();
        queue.Put("one");
        queue.Put("two");
        queue.Put("three");

        System.out.println(queue.get());
        System.out.println(queue.get());
        System.out.println(queue.get());
        System.out.println(queue.isEmpty());
    }
}


class Stack{
    LinkedList stack=new LinkedList();
    public void Push(){

    }
    public void Pop(){

    }
    public void Peek(){

    }
    public void Get(){

    }

}


class Queue{
    private LinkedList queue=new LinkedList();

    public void Put(Object o){
        queue.addLast(o);
    }
    public Object get(){
        return queue.removeFirst();
    }
    public boolean isEmpty(){
        return queue.isEmpty();
    }
}