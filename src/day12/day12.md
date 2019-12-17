



# 策略模式
- 封装变化的概念
- 编程中使用接口，而不是对接口的实现

## 组成
- 抽象策略角色： 通常由接口或抽象类实现(Comparator)
- 具体策略角色： 包装相关的算法和行为(MyComparator)
- 环境角色： 持有一个策略类的引用，最终给客户端调用 （TreeSet,TreeMap）

## 实现

- 策略模式的用意是针对一组算法，将每一个算法封装具有共同接口的独立的类，从而使得它们
可以相互替换

- 使用策略模式可以把行为和环境分隔开

- 环境类负责维持和查询行为类，各种算法则在具体策略中提供，由于算法
和环境独立开来，算法的修改都不会影响环境和客户端。

## 步骤
- 1 定义接口
- 2 编写策略类，实现上面的接口
- 3 在使用策略对象类（环境类）中保存一个对策略对象的引用
- 4 使用策略对象的类（环境类）中，实现对策略对象的set和get方法或者使用构造方法完成赋值


## 优缺点

- 客户端必须知道所有的策略类，自行决定更实用哪一个策略类
- 造成很多的策略类

- 解决方法，工厂方法



# Comparable  与 Comparator

Comparable和 Comparator都是java.util包下的两个接口，从字面上看这两个接口都是用来做比较用的，但是jdk里面不可能定义两个功能相同的接口，所以他们肯定有不同的用处。

## Comparable
Comparable可以认为是一个内比较器，实现了Comparable接口的类有一个特点，就是这些	类是可以和自己比较的，至于具体和另一个实现了Comparable接口的类如何比较，则依赖compareTo方法的实现，compareTo方法也被称为自然比较方法。如果开发者add进入一个Collection的对象想要Collections的sort方法帮你自动进行排序的话，那么这个对象必须实现Comparable接口。compareTo方法的返回值是int
>1、比较者大于被比较者（也就是compareTo方法里面的对象），那么返回正整数
 
>2、比较者等于被比较者，那么返回0
 
>3、比较者小于被比较者，那么返回负整数

```java
public class Girl implements Comparable<Object> {

	private String name;
	private int age;
	
    public Girl(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        Girl g = (Girl)o;
        return this.age - g.getAge();
    }

}
```
```
List<Girl> list = new ArrayList<>(100);
Collections.shuffle(list);
Collections.sort(list);  //会自动按照重写的compareTo排序
```


## Comparator
Comparator可以认为是是一个外比较器，个人认为有两种情况可以使用实现Comparator接口的方式：
1、一个对象不支持自己和自己比较（没有实现Comparable接口），但是又想对两个对象进行比较。
2、一个对象实现了Comparable接口，但是开发者认为compareTo方法中的比较方式并不是自己想要的那种比较方式。
Comparator接口里面有一个compare方法，方法有两个参数T o1和T o2，是泛型的表示方式，分别表示待比较的两个对象，方法返回值和Comparable接口一样是int，有三种情况：

> 1、o1大于o2，返回正整数
   
> 2、o1等于o2，返回0
 
> 3、o1小于o3，返回负整数

```java
public class GirlComparator implements Comparator<Girl> {

    @Override
    public int compare(Girl g1, Girl g2) {
        return g1.getAge() - g2.getAge();
    }
    
}
```
```
Arrays.sort(people, new Comparator<Person>() {
                @Override
                public int compare(Person o1, Person o2) {
                      return o1.getAge()-o2.getAge();
                   }
               });
```


## HashSet与Hash Map
1 HashSet底层是使用HashMap实现的，当使用add方法添加对象，实际上将改对象作为底层所
维护的Map对象的key，而value则都是同一个 Object对象。

2 HashMap底层维护一个数组，向HashMap放置的对象实际存在数组中

3 当向HashMap put一对键值，根据Key的hashCode值计算一个位置，该位置就是此对象准备往数组中存放的位置

4 如果该位置没有对象存在，直接放入，如果已经有，顺着此存在的对象的链开始寻找，如果此链有对象的时候，用equals
方法比较，如果为false,则放入数组，然后将之前的值链接到更新值得后面


