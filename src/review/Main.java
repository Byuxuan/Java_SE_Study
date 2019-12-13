package review;

import day5.ArrayTest;

import java.util.ArrayList;
import java.util.List;

public class Main {

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


    }
}
