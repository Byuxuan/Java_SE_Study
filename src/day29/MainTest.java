package day29;

public class MainTest {
    public static void main(String[] args) {
        Sample sample = new Sample();

        IncreaseThread increaseThread = new IncreaseThread(sample);
        IncreaseThread increaseThread1 = new IncreaseThread(sample);

        DecreaseThread decreaseThread = new DecreaseThread(sample);
        DecreaseThread decreaseThread1 = new DecreaseThread(sample);

        increaseThread.start();
        decreaseThread.start();
        increaseThread1.start();
        decreaseThread1.start();
    }
}
