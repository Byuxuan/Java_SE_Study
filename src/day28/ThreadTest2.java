package day28;

public class ThreadTest2 {
    public static void main(String[] args) {

        HelloThred helloThred=new HelloThred();



        Thread thread = new Thread(helloThred);
        helloThred=new HelloThred();
        Thread thread2 = new Thread(helloThred);
        thread.start();
        thread2.start();

    }

}

class HelloThred implements Runnable{
    int anInt;
    @Override
    public void run() {
        int anInt=0;
        while (true){
            System.out.println(this.anInt++);
            try {
                Thread.sleep((long)Math.random() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (this.anInt == 50) {
                break;
            }

        }
    }
}
