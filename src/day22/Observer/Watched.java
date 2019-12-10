package day22.Observer;

/**
 * 抽象的主题角色（抽象按钮）
 */
public interface Watched {

    public void addWatcher(Watcher watcher);

    public void removeWatcher(Watcher watcher);

    public void notifyWatcher(String string);


}
