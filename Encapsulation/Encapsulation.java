class ATM {
    // Private data (hidden)
    private int accountNumber;
    private int pin;
    private double balance;


    ATM(int accountNumber, int pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }


    private boolean validatePin(int inputPin) {
        return this.pin == inputPin;
    }


    public void deposit(int inputPin, double amount) {
        if (validatePin(inputPin)) {
            balance += amount;
            System.out.println("Deposit successful. New Balance: " + balance);
        } else {
            System.out.println("Invalid PIN");
        }
    }


    public void withdraw(int inputPin, double amount) {
        if (validatePin(inputPin)) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdraw successful. Remaining Balance: " + balance);
            } else {
                System.out.println("Insufficient balance");
            }
        } else {
            System.out.println("Invalid PIN");
        }
    }


    public void checkBalance(int inputPin) {
        if (validatePin(inputPin)) {
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("Invalid PIN");
        }
    }
}


public class Encapsulation {
    public static void main(String[] args) {
        ATM user = new ATM(12345, 1111, 5000);

        user.deposit(1111, 1000);
        user.withdraw(1111, 2000);
        user.checkBalance(1111);

        user.checkBalance(0000); // wrong PIN
    }
}