package day23;

public class MemberInnerClassTest {
    public static void main(String[] args) {


        MemberInner.Inner2 inner2 = new MemberInner().new Inner2(); //注意与静态内部类的区别
    }
}


class MemberInner{

    private int a=4;

    /**
     * 成员内部类
     */
    public class Inner2{
        private int a;

        public void doSommerthing(){

            System.out.println("hello world");
            System.out.println(MemberInner.this.a); //成员内部类访问外部类的同名变量
        }
    }
}