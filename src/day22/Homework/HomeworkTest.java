package day22.Homework;

public class HomeworkTest {
    public static void main(String[] args) {
        ObservableTest observableTest=new ObservableTest();


        ObserverTestFirst first=new ObserverTestFirst();
        ObserverTestSecond second=new ObserverTestSecond();

        observableTest.addObserver(first);
        observableTest.addObserver(second);

        observableTest.counter(10);

    }
}
