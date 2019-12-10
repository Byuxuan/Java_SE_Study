package day29.Clone;

import java.io.*;

public class CloneTest3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Teacher2 teacher2=new Teacher2();
        teacher2.setAge(30);
        teacher2.setName("teacher zhang");

        Student3 student31=new Student3();
        student31.setAge(10);
        student31.setName("student li");
        student31.setTeacher(teacher2);

        Student3 student32=(Student3) student31.deepCopy();

        System.out.println(student32.getName());
        System.out.println(student32.getTeacher().getName());


        System.out.println("---------------");

        teacher2.setName("teacher zhao");

        System.out.println(student32.getName());
        System.out.println(student32.getTeacher().getName());



    }
}


class  Teacher2 implements Serializable {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

class Student3 implements Serializable{
    private int age;

    private String name;



    private Teacher2 teacher;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher2 getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher2 teacher) {
        this.teacher = teacher;
    }

    public Object deepCopy() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);

        objectOutputStream.writeObject(this);

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());

        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);

        return objectInputStream.readObject();
    }



}