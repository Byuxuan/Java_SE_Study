package day16;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.temporal.ChronoUnit;

public class ReflectTest {
    /**
     * 实现对Custmer对象拷贝
     * @param object
     * @return
     */
    public Object copy(Object object) throws IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        /*
        第三种获得Class对象的方式
         */
        Class<?> classType=object.getClass();

        System.out.println(classType);
        System.out.println(classType.getName());
        System.out.println("-----------");

        Object instance=classType.newInstance(); //如果构造函数需要对象，则不能用该方法

        /*
        获得实例的第二种方式
         */

        Constructor constructor=classType.getConstructor(new Class[]{});
        Object obj=constructor.newInstance(new Object[]{});

        Object obj2=classType.newInstance();
        /*
        以上三行代码前两行等价于最后一行
         */

        System.out.println(obj);

        Constructor constructor2 = classType.getConstructor(new Class[]{String.class, int.class});
        Object obj3 = constructor2.newInstance(new Object[]{"hello", 3});

        System.out.println("---------");

        Object objCopy = classType.getConstructor(new Class[]{}).newInstance(new Object[]{});

        /**
         * 获取对象的所有成员变量
         */

        Field []fields=classType.getDeclaredFields();
        for (Field field : fields) {
            //System.out.println(field);
            String name = field.getName();
            //将属性的首字母大写
            String firstLetter = name.substring(0, 1).toUpperCase();
            String getMethodName = "get" + firstLetter + name.substring(1);
            String setMethodName = "set" + firstLetter + name.substring(1);
            System.out.println(getMethodName + "," + setMethodName);

            Method getMethod = classType.getMethod(getMethodName, new Class[]{});
            Method setMethod = classType.getMethod(setMethodName, new Class[]{field.getType()});

            Object value = getMethod.invoke(object, new Object[]{});
            setMethod.invoke(objCopy, value);

        }









        return objCopy;
    }

    public static void main (String[] args) throws  Exception{
        ReflectTest reflectTest=new ReflectTest();
        reflectTest.copy(new Customer());

        Customer customer = new Customer("Tom", 20);
        customer.setId(new Long(1L));

        Customer customer2 = (Customer) reflectTest.copy(customer);
        System.out.println(customer2.getId()+" "+customer2.getName()+" "+customer2.getAge());

    }

}

class Customer
{
    private Long id;
    private String name;
    private int age;

    public Customer(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}