package day23;

import java.util.Date;

public class AnnotationClassTest {

    public String get(Date date) {
        return date.toLocaleString();
    }

    public static void main(String[] args) {
        AnnotationClassTest test = new AnnotationClassTest();

//        String string = test.get(new Date());
//        System.out.println(string);
        /**
         * 定义了匿名内部类，继承了Date类，且没有重写任何方法
         * 生成了继承了Date类的子类的对象
         */
        String string=test.get(new Date(){
            @Override
            public String toLocaleString() {
                return "hello world";
            }
        });
        System.out.println(string);
    }
}
