## 静态导入 Static import


静态导入  import static导入到方法和成员变量级别才可以

# 反射

Java中，无论生成某个类的多少个对象，这些对象都会对应于同一个
Class对象

- 要想使用反射，首先需要获得待处理类的Class对象class<?> targetclass=TargetClass.class
- 获得目标类的实例 Object o=targetClass.newInstance()
- 获得目标类的方法 Method m=targetClass.getMethod("add",new Class[]{int.class})
其中需要传入两个参数，第一个参数方法的名字，第二个是参数的Class数组，包含参数类型的class

- 使用方法，返回Object对象， Object result=m.invoke(o,new Object[]{1})
调用invoke方法，第一个参数是类的实例，第二个参数是参数过程的Object数组

- Method对象传入的方法的参数和ivoke 传入的方法的参数个数相同

### 获取某个类或某个对象所对应的Class对象的3种方式（非常重要）
 - 1 Class.forName("java.lang.String")
 - 2 使用类的.class
 - 3 使用对象的getClass()方法
 
 ### 生成对象
 - 不带参数的构造方法， 
   - Object obj=classTpye.newInstance()
   - Constructor cons =classType.getConstructor(new Class[]{}),
     Object obj=cons.newInstance(new Object[]{})
     
- 带参数的构造方法
        Constructor constructor=classType.getConstructor(new Class[]{String.class,int.class});
        Object obj=constructor.newInstance(new Object[]{"hellow",3});
    
## Array

Integer.TYPE 返回的是int,而Integer.class返回的是Integer所对应的类
