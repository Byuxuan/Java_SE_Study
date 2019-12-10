package day22.Observer;

public class ConcreteWatcher implements  Watcher {
    @Override
    public void updata(String string) {
        System.out.println(string);
    }
}
