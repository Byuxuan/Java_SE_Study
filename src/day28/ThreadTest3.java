package day28;

public class ThreadTest3 {
    public static void main(String[] args) {
        Example example=new Example();

        Thread thread = new TheThread(example);
        Thread thread2 = new TheThread2(example);

        thread.start();
        thread2.start();
    }
}


class Example{
    public synchronized void execute() throws InterruptedException {
        for (int i = 0; i <50 ; i++) {
            Thread.sleep(50);
            System.out.println("example "+ i);
        }
    }
    public  synchronized void execute2() throws InterruptedException {
        for (int i = 0; i <50 ; i++) {
            Thread.sleep(50);
            System.out.println("hello "+ i);
        }
    }
}
class TheThread extends Thread{
    private Example example;

    public TheThread(Example example){
        this.example=example;
    }

    @Override
    public void run() {
        try {
            this.example.execute();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class TheThread2 extends Thread{
    private Example example;

    public TheThread2(Example example){
        this.example=example;
    }

    @Override
    public void run() {
        try {
            this.example.execute2();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}