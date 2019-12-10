package day29;

public class Sample {
    private int number;

    public synchronized void increase() throws InterruptedException {
        while (0 != number) {
            wait();
        }
        number++;
        System.out.println(number);
        notify();
    }
    public synchronized void decrease() throws InterruptedException {
        while (0==number){
            wait();
        }
        number--;
        System.out.println(number);
        notify();
    }
}

class IncreaseThread extends Thread{
    private Sample sample;

    public IncreaseThread(Sample sample) {
        this.sample = sample;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                sample.increase();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        }

}

class DecreaseThread extends Thread{
    private Sample sample;

    public DecreaseThread(Sample sample) {
        this.sample = sample;
    }

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                sample.decrease();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}