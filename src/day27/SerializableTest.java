package day27;

import java.io.*;

public class SerializableTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person2 person1 = new Person2(20, "zhangsan", 4.55);
        Person2 person2 = new Person2(30, "lisi", 4.78);

        FileOutputStream fileOutputStream = new FileOutputStream("E:/Person.txt");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(person1);
        objectOutputStream.writeObject(person2);

        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("E:/Person.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Person2 person3 = (Person2) objectInputStream.readObject();
        System.out.println(person3.name);
        Person2 person4 =(Person2) objectInputStream.readObject();
        System.out.println(person4.name);

        objectInputStream.close();

    }

}

class Person implements Serializable {
    int age;
    // transient 不会被保存
    String name;
    double height;

    public Person(int age, String name, double height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

}

class Person2 implements Serializable {
    int age;
    // transient 不会被保存
    String name;
    double height;

    public Person2(int age, String name, double height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    /**
     * 当自己定义writeObject readObject方法，序列化对象需要自己定义,可以更加细粒度的方式
     * @param out
     * @throws IOException
     */
    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        System.out.println("write object");
        out.writeInt(this.age);
        out.writeUTF(this.name);
    }

    private void readObject(java.io.ObjectInputStream in) throws  IOException{
        System.out.println("read object");
        this.age=in.readInt();
        this.name=in.readUTF();
    }

}