package day4;

public class StringTest2 {

    public static void main(String []args){
        String str=new String("aa");
        String str2=new String("aa");
        System.out.println(str.equals(str2));

        String str3="aa";
        String str4="aa";
        System.out.println(str3.equals(str4));

        Object o1=new Object();
        Object o2=new Object();
        System.out.println(o1.equals(o2));



    }
}
