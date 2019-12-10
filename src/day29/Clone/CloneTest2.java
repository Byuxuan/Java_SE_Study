package day29.Clone;

public class CloneTest2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Teacher teacher=new Teacher();
        teacher.setAge(30);
        teacher.setName("Teacher zhang");

        Student2 student2 = new Student2();
        student2.setAge(10);
        student2.setName("Student li");
        student2.setTeacher(teacher);

        Student2 student3=(Student2) student2.clone();

        System.out.println(student3.getName());
        System.out.println(student3.getTeacher().getName());

        System.out.println("-----------------");

        teacher.setName("Teacher zhao");

        System.out.println(student3.getName());
        System.out.println(student3.getTeacher().getName());

    }
}

class  Teacher implements Cloneable{
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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Student2 implements Cloneable{
    private int age;

    private String name;

    private Teacher teacher;

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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //浅拷贝，无法复制引用
//        Object object=super.clone();
//        return object;

        //深拷贝，重新复制一份引用
        Student2 student2=(Student2) super.clone();
        student2.setTeacher((Teacher) student2.getTeacher().clone());
        return  student2;
    }
}