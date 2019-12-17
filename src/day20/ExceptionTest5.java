package day20;

public class ExceptionTest5 {
    static int  a=10;
    public int method() {
        //int a=10;
        try{
            System.out.println("try 块");
            return 20;
        }
        catch (Exception ex){
            System.out.println("异常发生");
        }
        finally {
            System.out.println("finally 块");
            a=30;

        }
        System.out.println("后续代码块");
        return 40;
    }

    public void method2() {
        try{
            System.out.println("try 块");
            System.exit(0);
            System.out.println("try 块2");
        }
        catch (Exception ex){
            System.out.println("异常发生");
        }
        finally {
            System.out.println("finally 块");
        }
        System.out.println("后续代码块");
    }

    public static void main(String[] args) {
        ExceptionTest5 exceptionTest5=new ExceptionTest5();
        System.out.println(exceptionTest5.method());
        System.out.println(a);

    }

}
