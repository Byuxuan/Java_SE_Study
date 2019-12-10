package day28;

public class ThredTest {

    public static void main(String[] args) {
        Thread1 thread1=new Thread1();
        Thread2 thread2=new Thread2();
        Thread thread3=new Thread(new Thread3());

        System.out.println(thread1.getName());
        System.out.println(thread2.getName());


        thread1.start();
        thread2.start();
        thread3.start();
    }
}


class Thread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println("hello world: "+i);
        }
    }
}


class Thread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println("welcome: "+i);
        }
    }
}

class Thread3 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println("hhaah: " + i);
        }
    }
}