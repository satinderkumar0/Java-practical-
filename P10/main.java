class BankAccount {
    private String name;
    private String accountNumber;
    private double balance;

    BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    String getName() {
        return name;
    }

    String getAccountNumber() {
        return accountNumber;
    }

    double getBalance() {
        return balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit successful: " + amount);
        } else {
            System.out.println("Invalid deposit");
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawal successful: " + amount);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        BankAccount a = new BankAccount("Priya", "67890", 15000);

        System.out.println("Account Holder: " + a.getName());
        System.out.println("Account Number: " + a.getAccountNumber());
        System.out.println("Balance: " + a.getBalance());

        System.out.println();

        a.deposit(3500);
        a.deposit(-200);

        a.withdraw(4000);
        a.withdraw(0);
        a.withdraw(-300);
        a.withdraw(25000);

        System.out.println("\nUpdated Balance: " + a.getBalance());
    }
}
