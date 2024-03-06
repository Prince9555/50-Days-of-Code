import java.util.Scanner;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    // Get Balance method
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get account details from the user
        System.out.println("Enter account number:");
        String accountNumber = scanner.nextLine();

        System.out.println("Enter account holder name:");
        String accountHolder = scanner.nextLine();

        System.out.println("Enter initial balance:");
        double balance = scanner.nextDouble();

        // Create a new bank account
        BankAccount account1 = new BankAccount(accountNumber, accountHolder, balance);

        // Perform deposit
        System.out.println("Enter deposit amount:");
        double depositAmount = scanner.nextDouble();
        account1.deposit(depositAmount);

        // Perform withdrawal
        System.out.println("Enter withdrawal amount:");
        double withdrawalAmount = scanner.nextDouble();
        account1.withdraw(withdrawalAmount);

        // Get current balance
        double currentBalance = account1.getBalance();
        System.out.println("Current balance: " + currentBalance);

        scanner.close(); // Close the scanner object
    }
}
