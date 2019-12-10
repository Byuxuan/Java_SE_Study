package day29;

import day21.ExGui3;

public class ThreadTest4 {






    public static void main(String[] args) {
        Example example=new Example();

        TheThread theThread = new TheThread(example);
        TheThread2 theThread2 = new TheThread2(example);

        theThread.start();
        theThread2.start();
    }

}

class Example{
    /**
     * object 没有实际作用，只是为了起到锁的作用
     * @throws InterruptedException
     */
//    private Object object=new Object();
//    private Object object2 = new Object();

    public  void execute() throws InterruptedException {
        synchronized (this)
        {
            for (int i = 0; i <50 ; i++) {
                Thread.sleep(50);
                System.out.println("example "+ i);
            }
        }
    }
    public  void execute2() throws InterruptedException {
        synchronized (this){
            for (int i = 0; i <50 ; i++) {
                Thread.sleep(50);
                System.out.println("hello "+ i);
            }
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