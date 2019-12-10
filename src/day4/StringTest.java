package day4;

public class StringTest {

    public static void main(String[]args){
        String str=new String("aaa");
        String str2=new String("aaa");

        System.out.println(str==str2); //false

        String str3="aaa";
        String str4="aaa";
        System.out.println(str3==str4); //true

        String str5=new String("ccc");
        String str6="ccc";

        System.out.println(str5==str6); //false



        String str7=str3+str4;
        System.out.println(str7);

        str3="bbb";
        System.out.println(str3);


        String s="hello";
        String s1="hel";
        String s2="lo";
        System.out.println(s==s1+s2); //false

        System.out.println(s=="hel"+"lo"); //true





    }
}
