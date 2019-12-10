package day17;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.Vector;

public class VectorProxy implements InvocationHandler {

    private Object proxyObj;

    public VectorProxy(Object Obj) {
        this.proxyObj = Obj;
    }

    public static Object factory(Object Obj) {
        Class<?> classType=Obj.getClass();
        return Proxy.newProxyInstance(VectorProxy.class.getClassLoader(),classType.getInterfaces(),new VectorProxy(Obj));
    }



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before calling+" + method);
        if (args != null) {
            for (Object arg : args) {
                System.out.println(arg);
            }
        }
        Object object=method.invoke(proxyObj, args);

        System.out.println("after calling+"+ object);
        return  object;

    }

    public static void main(String[] args) {
        List v = (List) factory(new Vector());
        v.add("New");
        v.add("York");



    }
}
