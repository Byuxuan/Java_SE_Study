package day5;

public class ArrayTest {
    public static void main(String[]args){
        int []a=new int[4];

        System.out.println(a);

        int b[]=new int [4];

        int []c={1,2,3,4};
        System.out.println(c[2]);

        int []d=new int[]{1,2,3,4};


        int []e=new int[100];
        for(int i=0;i<e.length;i++){
            e[i]=i;
        }

        System.out.println(a[0]);

        int []f={1,2,3};
        int []g={1,2,3};
        System.out.println(f.equals(g));

        Person []person=new Person[3];

        System.out.println(person[0]);



        person[0]=new Person(10);
        person[1]=new Person(20);
        person[2]=new Person(30);

        for(int i=0;i<person.length;i++){
            System.out.println(person[i]);
            System.out.println(person[i].age);
        }

        Student [] students=new Student[100];
        for (int i=0;i<students.length;i++){
            students[i]=new Student();
            if (i%2==0){
                students[i].name="zhangsan";
            }
            else {
                students[i].name="lisi";
            }

            students[i].name= i%2==0?"zhangsan":"lisi";

        int [][]h=new int[2][3];
        System.out.println(h[0] instanceof int[]);

        int [][]r=new int [3][];
        r[0]=new int [2];
        r[1]=new int [3];

        int [][]s=new int [][]{{1,2,3},{4,5,6}};

        for(int k=0;i<s.length;i++){
            for(int j=0;j<s[i].length;j++){
                s[i][j]=0;
            }
        }









        }



    }
}


class Person{
    int age;
    public Person(int age){
        this.age=age;
    }


}

class Student{
    String name;

}