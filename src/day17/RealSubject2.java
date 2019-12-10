package day17;

/**
 * 真实对象
 */
public class RealSubject2 implements Subject2 {
    @Override
    public void request() {
        System.out.println("From real subject");
    }
}
