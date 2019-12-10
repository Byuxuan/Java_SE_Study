
## Map
map.entrySet() 返回一个Set集合，集合里面是Map.Entry的对象

## 泛型
1 定义泛型类别是，预设可以使用任何的类型来实例化泛型类型，但是如果想
限制使用泛型类别，只能用某个特定类型或者子类型才能实例化时，可以
使用extends关键字指定这个类型必须是集成某个类，实现某个接口

2 当没有指定泛型继承的类型或者接口时，默认使用extends Object
```java
public class ListGeneric<T extends List>{}
```
3 限制的第二种方式（此时不需要在类处声明，而在实例化的时候声明）：
```text
GenericTest<? extends List> genericTest
```  

4 GenericTest<? extends Object> 等价于 GenericTest<?>


5 使用<?>或者<? extends SomeClass>的声明方式，意味着只能通过
该名称来  取得  所参考的实例信息，或者移除（赋值为null），但是不能增加
信息。 理由时如果可以加入信息，那么就得记得取回的实例是什么类型，失去了泛型的意义



