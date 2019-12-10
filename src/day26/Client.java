package day26;

public class Client {
    public static void main(String[] args) {

        //结点流
        Component component=new ConcreteComponent(); //具体构建角色
        //过滤流
        Component component2 = new ConcreteDecorator1(component);
        //过滤流
        Component component3 = new ConcreteDecorator2(component2);

        component3.doSomething();
        System.out.println("------------");

        Component componentNew = new ConcreteDecorator1(new ConcreteDecorator2(new ConcreteComponent()));
        componentNew.doSomething();

    }
}
