class Account {
    private int balance;

    //synchronized public void deposit(int amount) {
    public void deposit(int amount) {
        int balance = this.balance;
        try {
            //Thread.sleep(10); // 오류 재현을 위한 코드
        } catch (Exception e) { // 수정필요
        }
        balance += amount;
        this.balance = balance;
    }

    public int getBalance() { // getter 
        return balance;
    }
}

class BankThread extends Thread {
    Account a;
    int amount;

    BankThread(String threadName, Account a, int amount) {
        super(threadName);
        this.a = a;
        this.amount = amount;       
    }
    public void run() {
        a.deposit(amount);
    }
}

public class SynchronizedExample {
    public static void main(String[] args) {
        Account a = new Account();

        BankThread t1 = new BankThread("Child 1", a, 10);
        BankThread t2 = new BankThread("Child 2", a, 20);
        System.out.println(t1.getName());
        
        t1.start();
        t2.start();
 
        try {
            t1.join();
            t2.join();
        } catch (Exception e) { // 수정필요
        }
        System.out.println(a.getBalance());
    }
}

