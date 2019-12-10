package day5;

public class StringBufferTest {

    public  static void main(String[]args){
        StringBuffer buffer=new StringBuffer();
        buffer.append("hello").append("world");
        System.out.println(buffer);
        String result= buffer.toString();
        System.out.println(result);

        String a="abc";
        boolean b=true;
        System.out.println(a+b);  //转化为字符串



    }
}
