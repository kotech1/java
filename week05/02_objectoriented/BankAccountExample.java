class BankAccount {
    private int balance;  // 외부에서 직접 접근 불가
    
    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public int getBalance() {   // 읽기만 허용
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;  // 제어된 방식으로 변경
        }
    }

    public void withdraw(int amount) { // 일관성 검증
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}

public class BankAccountExample {
    public static void main(String[] args) {
        BankAccount a = new BankAccount(100);
        //a.withdraw(-10);
        a.withdraw(10);
        //System.out.println(a.balance); // not visible
        System.out.println(a.getBalance()); 
    }
}
