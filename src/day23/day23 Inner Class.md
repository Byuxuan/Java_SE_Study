# 内部类

- 分为4种

## 内部类
- 只能访问外部类的静态成员变量与静态方法，生成静态内部类对象的方式为
OutClass.InnerClass inner=new OutClass.InnerClass()

- 成员内部类：可以访问外部类的静态与非静态方法与成员变量。生成成员内部类对象的方式为：
OutClass.InnerClass inner=new OutClass().new InnerClass()

- 若想在成员内部类中访问外部类的成员变量，语法为
OutClass.this.a

- 局部内部类定义在方法中，只能访问方法中声明的final类型的变量（Java8引入一个effectively final的概念，当内部类访问外部类变量时，只要内部类不对外部变量重新赋值，那么外部类变量就是一个事实上的final变量，Java会隐含地将外部变量声明为final。)

- 匿名内部类： 隐式地继承一个父类或实现一个接口