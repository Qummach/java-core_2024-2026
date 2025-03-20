package laba2;

public class Task7 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        BankAccount account1 = new BankAccount(500);

        account.setBalance(200);
        account.deposit(500);
        account1.deposit(1000);

        account.withdraw(100);
        account1.withdraw(200);

        System.out.println("Баланс: " + account.getBalance());
        System.out.println("Баланс: " + account1.getBalance());
    }
}

class BankAccount implements BankAccountInterface {
    double balance;

    public BankAccount() {

    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Пополнение на сумму: " + amount + " Текущий баланс: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Было снято: " + amount + " Текущий баланс: " + balance);
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

interface BankAccountInterface {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}