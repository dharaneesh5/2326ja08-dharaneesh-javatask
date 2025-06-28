class Bank {
    private int balance = 1000;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | Balance: " + balance);
    }

    public synchronized void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Balance: " + balance);
        } else {
            System.out.println("Not enough balance to withdraw " + amount);
        }
    }
}

class DepositThread extends Thread {
    Bank bank;

    public DepositThread(Bank bank) {
        this.bank = bank;
    }

    public void run() {
        bank.deposit(500);
    }
}

class WithdrawThread extends Thread {
    Bank bank;

    public WithdrawThread(Bank bank) {
        this.bank = bank;
    }

    public void run() {
        bank.withdraw(700);
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Thread t1 = new DepositThread(bank);
        Thread t2 = new WithdrawThread(bank);
        Thread t3 = new WithdrawThread(bank);

        t1.start();
        t2.start();
        t3.start();
    }
}