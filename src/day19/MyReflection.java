package day19;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyReflection {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> classType = MyTest.class;

        MyTest myTest = new MyTest();

        Method method = classType.getDeclaredMethod("input", new Class[]{});

        if (method.isAnnotationPresent(MyAnnotation.class))
        {
            method.invoke(myTest, new Object[]{});
            MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);

            String hello=myAnnotation.hello();
            String world=myAnnotation.world();
            System.out.println(hello+" "+ world);

        }

        Annotation[] annotations = method.getAnnotations();
        for (Annotation annotation : annotations) {
            // 只能读取到AnnotationPolocy.RUNTIME 的
            System.out.println(annotation.annotationType().getName());
        }




    }
}
