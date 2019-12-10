package day9;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkArrayTest {
    public static void main(String[] args) {
        BNode []nodes=new BNode[4];
        for (int i = 0; i <4 ; i++) {
            nodes[i]=new BNode("node"+(i+1));
        }
//        for (BNode node : nodes) {
//            System.out.println(node.data + node.next.data + node.previous.data);
//
//        }
        nodes[0].next=nodes[1];
        nodes[0].previous=nodes[2];

        nodes[1].next=nodes[2];
        nodes[1].previous=nodes[0];

        nodes[2].next=nodes[0];
        nodes[2].previous=nodes[1];

        for (int i = 0; i <3 ; i++) {
            System.out.println(nodes[i].data+nodes[i].previous.data+nodes[i].next.data);
        }

        nodes[3].previous=nodes[0];
        nodes[0].next.previous=nodes[3];
        nodes[3].next=nodes[0].next;
        nodes[0].next=nodes[3];



        for (BNode node : nodes) {
            System.out.println(node.data + node.next.data + node.previous.data);

        }

        LinkedList linkedList = new LinkedList();
        linkedList.add("hello");
        linkedList.add("welcome");
        linkedList.add("nihao");

        String []strings= (String [])linkedList.toArray(new String[0]);
        for (String string : strings) {
            System.out.println(string);
        }

        LinkedList linkedList1=new LinkedList();
        linkedList1.add(1);
        linkedList1.add(4);

        Integer [] ints=(Integer []) linkedList1.toArray(new Integer[0]);

        for (Integer anInt : ints) {
            System.out.println(anInt);
        }

        ArrayList arrayList=new ArrayList();
        arrayList.add("hahaah");
        arrayList.add("jiujiujiu");
        String []strings1=(String [])arrayList.toArray(new String [0]);











    }

}
