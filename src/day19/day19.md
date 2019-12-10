

## Annotation

### java.lang.annotition.Target
- 定义使用时机，描述类还是方法

定义时要 指定 java.lang.annotaiton.ElementType枚举值之一


# JUnit(3.8 4.x)

3.8使用反射
4.x 使用反射加注解

- Keep the bar green to keeep the code clean
- No Reflection, No most frameworks

- jUnit 4 的一般执行流程：
  - 首先获得待测试类所对应的Class对象
  - 通过该Class对象获得当前类中所有public方法所对应的Method数组
  - 遍历该Method数组，取得每一个Method对象
  - 调用每个Method对象的isAnnotationPresent(Test.class) 方法，判断该方法是否被Test注解所修饰
  - 如果ture,调用method.invoke()方法执行该方法，否则不执行


- 单元测试不是为了证明你是对的，而是证明你没有错误（Input is evil.）

## 单元测试框架

