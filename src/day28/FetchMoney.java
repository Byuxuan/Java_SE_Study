package day28;

public class FetchMoney {
    public static void main(String[] args) {
        Bank bank=new Bank();

        Thread thread1 = new MoneyThread(bank);

        //bank=new Bank();
        Thread thread2 = new MoneyThread(bank);

        thread1.start();
        thread2.start();
    }
}


class Bank{
    private  int money=1000;

    public synchronized int getMoney(int number) throws InterruptedException {
        if (number < 0) {
            return -1;
        } else if (number > money) {
            return -2;
        }
        else{
            Thread.sleep(2000);
            money-=number;
            System.out.println("left money: "+money);
            return number;
        }
    }
}

class MoneyThread extends Thread{
    private Bank bank;

    public MoneyThread(Bank bank) {
        this.bank=bank;
    }

    @Override
    public void run() {
        try {
            System.out.println(bank.getMoney(800));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}