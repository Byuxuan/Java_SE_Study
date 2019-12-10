/**
 * Created by byx on 11/7/2019
 */

package day8;


import java.util.ArrayList;

public class ArrayListTest2 {

    public static void main(String[] args) {
        ArrayList List=new ArrayList();
        List.add("hello");
        List.add(2);
        String str=(String) List.get(0);
        //String in2=(String) List.get(1);  报错，返回是一个引用类型，不是一个原生类型
        Integer in=(Integer) List.get(1);

        System.out.println(str);
        System.out.println(in);

        ArrayList list=new ArrayList();


        list.add(4.1);
        list.add(4.3);

        double sum=0;
        for (Object i : list) {
            double value=((Double) i).doubleValue();
            sum+=value;

        }
        System.out.println(sum);

        ArrayList arrayList2=new ArrayList();
        arrayList2.add(1);
        arrayList2.add(2);
        arrayList2.add(3);

        //Integer []array3=(Integer[]) arrayList2.toArray();//cannot be cast to class [Ljava.lang.Integer; ([Ljava.lang.Object; and [Ljava.lang.Integer; are in module java.base of loader 'bootstrap')
        Object []array3=arrayList2.toArray();
        for (Object i : array3) {
            System.out.println(((Integer)i).intValue());
        }
        System.out.println("**********");
        ArrayList arrayList3=new ArrayList();
        arrayList3.add(new Point(2, 3));
        arrayList3.add(new Point(3, 4));
        arrayList3.add(new Point(4, 5));
        for (Object i : arrayList3) {
            System.out.println(i);
        }
        System.out.println(arrayList3);

        ArrayList arrayList4=new ArrayList(8);



    }
}

class Point{
    int x,y;

    /**
     *
     * @param x
     * @param y
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     *
     * @return return axis of xand y
     */

    @Override
    public String toString() {
        return "x="+this.x+"  y="+this.y;
    }
}