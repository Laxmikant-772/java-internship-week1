
class BankAccount {
    double balance = 1000;

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.checkBalance();

        account.deposit(500);
        account.checkBalance();

        account.withdraw(200);
        account.checkBalance();
    }
}
 

