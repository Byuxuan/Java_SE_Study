# 异常

## 分类
- Checked exception
- Uncheked exception(Runtime Exception)

## Runtime Exception

- java中所有的异常类都会直接或间接地继承自Exception
-  Runtime Exception直接继承Exception,运行时异常，所有的
运行时异常都会直接或间接地继承自RuntimeException.
- Java中凡是继承自Exception，而没有继承RunException，都是非运行时
异常。

```text
try{

}
catch(Exception e){
}

finally{}



```
- 无论程序是否出现异常，finally都会被执行，try中出现异常，直接跳转catch,将异常赋值给e
- 一个try可以有多个catch块

- 对于非运行时异常，必须要对其进行处理，处理方式有两种
，第一种时try..catch...finally进行捕获，第二种是调用产生该异常方法所在的方法声明throws Exception

- 对于运行时异常，我们可以不对其进行处理，也可以对其进行处理。

- NullPointerException是空指针异常, 出现该异常的原因在于某个引用为null，但是却调用了它的某个方法


## 自定义异常

- 所谓自定义异常，通常就是定义了一个继承自Exception类的子类，这个类就是自定义异常类
一般不会继承某个运行时异常类

- 一个方法抛出多个异常，需要多个catch块

- 我们可以使用多个catch块捕获异常，这时需要将父类性的catch块放到子类型的catch块之后，
才能保证后续的catch可能被执行，否则子类型的catch将永远无法到达，java编译器会报编译错误，如果多个catch块
的异常类型是独立的，那么谁前谁后都是可以的

- 如果try块中有return 语句，那么首先也需要将finally块执行，后返回return

- 如果try块有exit(0)语句，那么try块遇到exit(0)结束，程序终止
System.exit(0)会终止当前运行的JVM

