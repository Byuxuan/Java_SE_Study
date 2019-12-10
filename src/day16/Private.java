package day16;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Private {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        PrivateTest privateTest=new PrivateTest();
        Class<?> classType=privateTest.getClass();

        Method method = classType.getDeclaredMethod("sayHello", new Class[]{String.class});
        method.setAccessible(true); //压制java 的访问控制检查
        String str = (String) method.invoke(privateTest, new Object[]{"zhangsan"});
        System.out.println(str);


        Field field = classType.getDeclaredField("name");
        field.setAccessible(true);
        field.set(privateTest, "lisi");

        System.out.println(privateTest.getName());

//        Method method2=classType.getMethod("getName",new Class[]{});
//        method2.setAccessible(true);
//        String str2 = (String) method2.invoke(privateTest, new Object[]{});
//        System.out.println(str2);






    }
}
