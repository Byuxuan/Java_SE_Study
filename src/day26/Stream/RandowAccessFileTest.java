package day26.Stream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandowAccessFileTest {
    public static void main(String[] args) throws IOException {
        Person person = new Person(1, "hello", 5.32);
        RandomAccessFile file = new RandomAccessFile("E:/hello.txt", "rw");

        person.write(file);
        file.seek(0);

        Person person2 = new Person();
        person2.read(file);
        System.out.println(person2.anInt);






    }
}



class Person{
    int anInt;
    String name;

    double height;

    public Person() {
    }

    public Person(int anInt, String name, double height) {
        this.anInt = anInt;
        this.name = name;
        this.height = height;
    }

    public void write(RandomAccessFile raf) throws IOException {
        raf.writeInt(this.anInt);
        raf.writeUTF(this.name);
        raf.writeDouble(this.height);

    }
    public void read(RandomAccessFile raf) throws IOException {
        this.anInt = raf.readInt();
        this.name = raf.readUTF();
        this.height = raf.readDouble();
    }
}
