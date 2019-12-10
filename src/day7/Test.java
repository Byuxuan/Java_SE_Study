package day7;
import java.util.Random;

public class Test {

    public static void  main(String[]args){
         Random random=new Random();
         int array[]=new int [50];
         for(int i=0;i<50;i++){
             System.out.println(random.nextInt(41)+10);  // [10-50]之间的整数,默认的区间都是[a,b)
             //System.out.println(int(Math.random()*41)+10);
             double result=Math.random()*41;
             int result2=(int) result+10;
             System.out.println(result2);
             array[i]=result2;
         }




    }

}
