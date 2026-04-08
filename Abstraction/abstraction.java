
abstract class BankAccount {
    protected double balance;

  
    BankAccount(double balance) {
        this.balance = balance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);


    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}


class SavingsAccount extends BankAccount {

    SavingsAccount(double balance) {
        super(balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited in Savings: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn from Savings: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}


class CurrentAccount extends BankAccount {

    CurrentAccount(double balance) {
        super(balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited in Current: " + amount);
    }

    void withdraw(double amount) {
        balance -= amount; // allows overdraft
        System.out.println("Withdrawn from Current: " + amount);
    }
}

public class abstraction {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount(1000);
        acc1.deposit(500);
        acc1.withdraw(200);
        acc1.displayBalance();

        BankAccount acc2 = new CurrentAccount(2000);
        acc2.withdraw(2500);
        acc2.displayBalance();
    }
}