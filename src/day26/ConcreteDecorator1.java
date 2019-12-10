package day26;

public class ConcreteDecorator1 extends Decorator {

    public ConcreteDecorator1(Component component) {
        super(component);
    }

    @Override
    public void doSomething() {
        super.doSomething();
        this.doAntherThing();
    }
    private void  doAntherThing(){
        System.out.println("功能B");
    }
}
