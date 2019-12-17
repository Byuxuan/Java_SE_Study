package review;

import day5.ArrayTest;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public  int output(int value){
        try{
            value=value/0;
           return value*value;
        }
        catch (Exception e){
            return 1;
        }

        finally {
            return 0;
        }
    }

    public  void ArraysTest(List<List<String>> string){
        for (List<String> list : string) {
            for (String s : list) {
                System.out.println(s);
            }
            System.out.println("--------------");
        }
    }
    public static void main(String[] args) {
        List<List<String>> listList = new ArrayList<>();

        List<String> arrayList=new ArrayList<String>();

        arrayList.add("hello");
        arrayList.add("world");

        List<String> arryaList2 = new ArrayList<String>();

        arryaList2.add("hello2");
        arryaList2.add("world2");

        listList.add(arrayList);
        listList.add(arryaList2);

        Main main = new Main();
        main.ArraysTest(listList);


        System.out.println("--------------");
        System.out.println(main.output(2));


    }
}


class Father {
    private int id=100;
    private String name;

    public Father(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
class Child extends  Father{
    public Child(int id, String name, int age) {
        super(id, name);
        this.age = age;
    }

    private int age;

}
