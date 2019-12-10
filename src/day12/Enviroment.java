package day12;

public class Enviroment {
    private Strategy strategy; //持有一个策略类的引用

    private int age;
    private int address;


    public Enviroment(Strategy strategy) {
        this.strategy = strategy;
    }



    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return this.strategy;
    }

    public int calculate(int a,int b){
        return strategy.calculate(a, b);  // Ctrl alt B
    }
}
