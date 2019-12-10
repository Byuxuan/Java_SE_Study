package day30;

public class Singleton {

    private static Singleton singleton;
    private Singleton(){

    }

    public static Singleton getInstance() throws InterruptedException {
        if(null==singleton){
            Thread.sleep((long) Math.random()*4000);

            singleton = new Singleton();
        }
        return singleton;
    }

    public static void main(String[] args) throws InterruptedException {
        new TheThread().start();
        new TheThread().start();





    }
}

class TheThread extends Thread{

    @Override
    public void run() {
        try {
            System.out.println(Singleton.getInstance());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}