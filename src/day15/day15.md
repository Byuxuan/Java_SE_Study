## Box
- Integer类有一个缓存，缓存介于 -128-127的数

## 可变参数

可变参数本质是一个数组，对于某一个声明了可变参数的方法
我们可以传递离散值，也可以传递数组对象。如果方法参数定义为数组，
只能传递数组而能传离散值

方法只能接受一个可变参数，并且是参数列表最后一个。

## 枚举

我们所定义的每个枚举类型都继承自java.lang.Enum类，枚举中的每个成员都是
public static final的

- 每个枚举的成员就是我们定义的枚举类型的实例（Instance）, 当定义了一个枚举类型后
，编译时刻就能确定该枚举类型有几个实例，分别是什么，在运行期间我们无法再
使用该枚举类型创建新的实例