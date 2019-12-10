package day17;

import java.lang.reflect.Proxy;

public class Foodemo {
    public static void main(String[] args) {
        CommonInvocationHandler handler=new CommonInvocationHandler();
        Foo foo=null;

        handler.setObject(new FooImpl());

        foo=(Foo) Proxy.newProxyInstance(Foo.class.getClassLoader(), new Class[]{Foo.class}, handler);

        foo.doAction();
        System.out.println("------------");

        handler.setObject(new FooImpl2());

        foo = (Foo) Proxy.newProxyInstance(Foo.class.getClassLoader(), new Class[]{Foo.class}, handler);

        foo.doAction();
    }
}
