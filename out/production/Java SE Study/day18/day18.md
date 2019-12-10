# Annotation 注解

此功能定义一个annotatio 类型的语法，一个描述annotation声明的语法，
读取annotation 的API， 一个使用annotation修饰的class文件，一个
annotation处理工具的组成。

- Override注解表示子类要重写父类的对应方法
- Deprecated注解表示方法是不建议被使用的
- SuppressWarning 注解表示抑制警告
- 自定义注解： 当注解中的属性名为value时，对其赋值可以不指定属性名称直接写属性值，
其他都需要明确指定。
String value() default "hello";

- 当我们使用@interface 关键字定义注解是，隐含地继承了java.lang.annotation
- 如果我们定义了一个接口，让该接口继承Annotation， 那么我们所定义的接口依然还是接口
而不是注解，Annotation本身时接口而不是注解，可以于Enum类比。

## Retention
- 指示注解具有注释类型的保留时间，默认为RententionPolicy.CLASS
- RententionPolicy (Enum) 
  - CLASS  注解被记录在class文件中，但是JVM不需要在运行时保留
  
  - RUNTIIME 注解将由编译器记录在类文件中，由JVM运行时保留，可以反射读取
  > 比如 @Deprecated 运行期
  - SOURCE 注释将被编译器丢弃
  > 比如 SuppressWarning,仅在编译时期告知编译程序抑制警告，不必保存在.class文件