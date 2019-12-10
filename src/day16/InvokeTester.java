package day16;

import java.lang.reflect.Method;

public class InvokeTester {
    public int add(int param1, int param2){
        return param2+param1;
    }
    public String echo(String message){
        return "hello "+message;
    }

    public static void main(String[] args) throws Exception {
        InvokeTester invokeTester=new InvokeTester();
        System.out.println(invokeTester.add(1, 2));
        System.out.println(invokeTester.echo("world"));

        /**
         * Method1 获得class对象的全称
         */
       // Class<?> classType = Class.forName("InvokeTester");

        /**
         * Method2 每个类都有一个class对象
         */
        Class<?> classType2=InvokeTester.class;
        Object invokeTester2=classType2.newInstance();

        System.out.println(invokeTester2 instanceof InvokeTester);

        /**
         *  getMethod(String name, Class<?>... parameterTypes)
         *  获得方法的名字，方法所需要的参数的class对象构成的数组
         *  为了避免重载的冲突，通过方法名和参数确定
         */

        /**
         * invoke（） 第一个参数 对象，第二个参数，方法所需要的具体参数
         */

        Method addMethod=classType2.getMethod("add", new Class[]{int.class,int.class});
        Object result = addMethod.invoke(invokeTester2, new Object[]{1, 2});
        System.out.println(result);

        System.out.println("-----------");

        Method echmethod = classType2.getMethod("echo", new Class[]{String.class});
        Object result2=echmethod.invoke(invokeTester2,new Object[]{"world"});
        System.out.println((String) result2);







    }
}
