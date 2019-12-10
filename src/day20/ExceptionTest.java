package day20;

public class ExceptionTest {
    public static void main(String[] args) {
        int c=0;
        try
        {
            int a=3;
            int b=0;
            c=a/b; //出现异常后直接转到catch


        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("welcome");
        }

        System.out.println(c);


    }
}
