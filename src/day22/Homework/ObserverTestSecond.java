package day22.Homework;

import java.util.Observable;
import java.util.Observer;

public class ObserverTestSecond implements Observer {
    @Override
    public void update(Observable o, Object arg) {

        Integer newArg=(Integer) arg;
        if(newArg<6)
            System.out.println("Second"+ newArg);
    }
}
