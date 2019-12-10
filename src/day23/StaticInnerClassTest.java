package day23;

import javax.crypto.spec.PSource;

public class StaticInnerClassTest {
    public static void main(String[] args) {
        StaticInner.Inner inner=new StaticInner.Inner();
        inner.output();

    }
}

class  StaticInner{
    private static int a=4;

    /**
     * 静态内部类，只能访问外部静态方法和静态变量
     */
    public static class Inner{
        public void  output(){
            System.out.println(a);
        }
    }
}