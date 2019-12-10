package day6;

public class SwapTest {

    public static void  swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }

    public static void  swap2(Integer a,Integer b){
        Integer temp;
        temp=a;
        a=b;
        b=temp;
    }

    public static void swap3(char[] ch,char c){
        ch[0]='B';
        c='C';
    }

    public static void swap4(int []i){
        int temp=i[0];
        i[0]=i[1];
        i[1]=temp;
    }

    public static boolean compareArr(int []a,int []b){
        if (a==null ||b==null) return false;
        if (a.length != b.length) return false;
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]) return false;
        }
        return true;


    }

    public static void main(String[]args){
        int x=3,y=4;
        swap(x,y);
        System.out.println(x);
        System.out.println(y);

        // out: 3, 4

        Integer x2=3,y2=4;
        swap2(x2,y2);
        System.out.println(x2);
        System.out.println(y2);

        char []ch={'A','B'};
        char c='C';
        swap3(ch,'c');
        System.out.println(ch[0]);
        System.out.println(c);

        int []i={3,4};
        swap4(i);
        System.out.println(i[0]);
        System.out.println(i[1]);

        I[]o=new I[2];
      //  I p=new I(); //I 是抽象类不能被实例化
        o[0]=new C();
        o[1]=new C();

        I[]p=new I[]{new C(),new C()};



    }
}

interface I{

}

class C implements I {

}