package day4;

public class EqualsTest {
    public static void main(String[]args){
        Studentt s1=new Studentt("zhangsan");
        Studentt s2=new Studentt("zhangsan");

        System.out.println(s1==s2);

        System.out.println(s1.equals(s2));


    }
}

class  Studentt{
    String name;
    public Studentt(String name){
        this.name=name;
    }

    @Override //重写
    public boolean equals(Object obj) {

        if (this==obj) return  true;
        else {

            if (obj instanceof Studentt) {
                Studentt obj2 = (Studentt) obj;
                if(obj2.name.equals(this.name)) return true;

                }
            }

        return false;



       // return super.equals(obj);}
    }
}