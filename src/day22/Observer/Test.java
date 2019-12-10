package day22.Observer;

import java.util.Observable;

public class Test {
    public static void main(String[] args) {
        Watched girl =new ConcreteWatched(); // 主题角色被监听

        Watcher watcher1=new ConcreteWatcher(); // 观察者角色监听主题角色
        Watcher watcher2=new ConcreteWatcher();
        Watcher watcher3=new ConcreteWatcher();

        girl.addWatcher(watcher1); // 监听器在主题中进行注册
        girl.addWatcher(watcher2);
        girl.addWatcher(watcher3);

        girl.notifyWatcher("开心"); // 类似于点击
        girl.removeWatcher(watcher2);

        girl.notifyWatcher("不爽");

        Observable observable=new Observable();
    }
}
