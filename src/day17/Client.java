package day17;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        System.out.println("-----静态-----");
        Subject subject=new ProxySubject();
        subject.request();

        System.out.println("-----动态-----");

        RealSubject2 realSubject2=new RealSubject2(); //真实对象的实例

        InvocationHandler handler = new DynamicProxySubject(realSubject2); //代理对象的实例

        Class<?> classType=handler.getClass(); //代理实例的类

        /**
          返回指定接口（Interface Subject2）的代理类的实例，该接口将方法调用分派给指定的调用处理程序
           Proxy创建动态代理对象的实例，三个参数值，
         第一个是  代理类或者真实类的类加载器
         第二个是  代理类实现的接口列表
         第三个是  调度方法的处理函数

         */
        Subject2 subject2=(Subject2) Proxy.newProxyInstance(realSubject2.getClass().getClassLoader(), realSubject2.getClass().getInterfaces(), handler);

        /**
         * 动态生成类 proxy.$Proxy0
         * 此时，subject2.request() 交由 hander代理，从而执行hander内部的invoke方法
         */
        subject2.request();
        //subject2.request(可以添加参数，Object[]{});

        System.out.println(subject2.getClass());

        System.out.println("-------------");


    }
}
