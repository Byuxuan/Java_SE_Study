# Set

## HashSet

### add() 
- hashCode方法得到调用，判断已经存储在集合中对象的hashcode 值是否与增加的对象的hash
code 值，如果不一致，直接加进去，如果不一致，在进行equals方法的比较，如果返回true，表示对象已经
加进去了，不会再增加，否则加进去。



- 关于Object类的equals方法的特点
  - 自反性
  - 对称性
  - 传递性
  - 一致性： x.equals(y)第一次为ture,第n次也是true.
  - 对于非空引用x,x.equals(null)返回false
- 关于Object Hashcode()方法、
  - 在java应用的一次执行过程中，对于同一个对象的hashCode方法的多次调用，应返回同样的值
  - 如果equals方法两个对象相等，则在两个对象中的每个对象上调用hashCode方法必须产生相同的整数结果
  - 对于两个对象来说，如果equals方法返回false，那么这两个对象的hashCode值不要求一定不同（可以相同，可以不同）
  - 对于Object类来说，不同的Object对象的hashCode值是不同的
  
- 如果我们重写equals方法，那么也要重写hashCode方法，反之亦然
- Iterator iterator=hashSet.iterator();


# Map

Map: keySet() 返回一个set, values返回collection