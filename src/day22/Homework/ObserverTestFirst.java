package day22.Homework;

import java.lang.annotation.Inherited;
import java.util.Observable;
import java.util.Observer;

public class ObserverTestFirst implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Integer newArg=(Integer) arg;
        System.out.println("first"+ newArg);
    }
}
