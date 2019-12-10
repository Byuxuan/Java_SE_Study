package day22.Homework;

import java.util.Observable;
import java.util.Observer;

class ObservableTest extends Observable {

    void counter(int number) {
        for (; number >= 0; number--) {
            this.setChanged();
            this.notifyObservers(number);

        }
    }

}
