package day4;

public class ObjectTest {

    public static void main(String[]args){
        Object object=new Object();
        System.out.println(object);
        System.out.println(object.toString());

        String str="aaa";
        System.out.println(str);

        Student stu=new Student();
        System.out.println(stu);

        System.out.println("____________");




    }
}

class Student{

    public String toString(){
        return "hello";
    }

}