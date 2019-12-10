package day20;

public class ExceptionTest2 {
    public void method() throws Exception{
        System.out.println("hello world");
        throw new Exception();
    }

    public static void main(String[] args)  {
        ExceptionTest2 exceptionTest2=new ExceptionTest2();
        try{
            exceptionTest2.method();
        }
        catch (Exception e){

            e.printStackTrace();

        }
        finally {
            System.out.println("aaa");
        }
    }
}
