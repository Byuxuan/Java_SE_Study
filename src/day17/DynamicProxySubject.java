package day17;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理
 * 该代理类的内部属性是Object类型，实际使用的时候通过该类的构造方法传递一个对象
 * 此外，该类实现了invoke方法，该方法中的method.invoke其实就是调用被代理对象
 * 将要在执行的方法，方法的参数是sub,表示该方法从属于sub，通过动态代理类，我们可以
 * 执行真实对象方法前后附加操作
 */
public class DynamicProxySubject implements InvocationHandler {
    private Object sub;

    public DynamicProxySubject(Object sub) {
        this.sub = sub;
    }

    /**
     *
     * @param proxy 该方法的代理实例
     * @param method 所述方法对应于代理实例上的接口方法的实例
     * @param args 包含的方法调用传递代理实例的参数值
     * @return  该方法的返回值
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before calling: "+ method);

        /**
         * 此句表示执行真实类的方法
         */
        method.invoke(sub, args);

        System.out.println("after calling: "+ method);
        return null;
    }
}
