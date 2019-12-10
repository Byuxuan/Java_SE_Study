package day20;

public class TestMyException {
    public void method(String str) throws Exception {
        if(str==null){
            throw new MyException("传入的字符串不能为空");
        }
        else if (str.equals("hello")){
            throw new MyException2("不能为hello");
        }
    }

    public static void main(String[] args) {
        TestMyException testMyException=new TestMyException();
        try{
            testMyException.method(null);
        }
        catch (MyException  e)
        {
            System.out.println("MyException");
            e.printStackTrace();
        }
        catch (MyException2 e){
            System.out.println("MyException2");
            e.printStackTrace();
        }
        /**
         * 虽然加上了Exception，但是永远不会执行
         * 如果注释掉第一个，则可以执行第三个
         * 范围小的catch 要放在上面，否则永远不会执行后面的Exception
         */
        catch (Exception e) {
            System.out.println("Exception");
            e.printStackTrace();
        } finally {
            System.out.println("end");
        }



    }
}
