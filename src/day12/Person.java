package day12;

/**
 * 若干个类Person对象存在一个list当中，对他们进行排序，分别按照名字，年龄，id进行排序（正序，倒序）。
 * 年龄或者姓名重复，按照id的正序进行排序，要求使用策略模式进行。
 */
public class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
