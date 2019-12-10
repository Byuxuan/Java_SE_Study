package day8;


import java.util.ArrayList;
import java.util.Stack;

public class ArrayListTest {


    public static void main(String[]args){
        ArrayList arrayList=new ArrayList();

        arrayList.add("hell");
        arrayList.add("world");
        arrayList.add("welcome");

        String s1=(String) arrayList.get( 0);  //get 返回的是一个Object对象
        System.out.println(arrayList.get(2));
       // System.out.println(arrayList[2]);

        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }

        System.out.println(arrayList.indexOf("welcome"));




    }





}
