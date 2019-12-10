package day16;

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

import java.lang.reflect.Array;

public class ArrayTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> classType = Class.forName("java.lang.String");
        Object array = Array.newInstance(classType, 10);

        Array.set(array, 5, "hello");
        String str =(String)Array.get(array, 5);


        int[] dims = new int[]{5, 10, 15};
        System.out.println(Integer.TYPE); //TYPE是原生数据类型
        System.out.println(Integer.class);


        Object array2 = Array.newInstance(Integer.TYPE, dims); //创建一个（5，10，15）的数组
        Object arrayObj = Array.get(array2, 3); //二维数组
        //Class<?> classType2=arrayObj.getClass().getComponentType();// 返回二维数组的类对象

        arrayObj = Array.get(arrayObj, 5); //返回一维数组
        Array.setInt(arrayObj, 10, 37);// 把第10位置的数字设置为37
        int [][][] arrayCast=(int [][][])array2;
        System.out.println(arrayCast[3][5][10]);


    }
}
