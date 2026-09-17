
// Base class: BankAccount
class BankAccount {
    protected String accountHolder;
    protected int accountNumber;
    protected double balance;

    // Constructor
    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | New Balance: " + balance);
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    // Display account details
    public void displayAccount() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

// Derived class: SavingsAccount (inherits BankAccount)
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountHolder, int accountNumber, double balance, double interestRate) {
        super(accountHolder, accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Method overriding: withdraw with restriction
    @Override
    public void withdraw(double amount) {
        if (balance - amount < 500) { // Minimum balance restriction
            System.out.println("Cannot withdraw. Minimum balance of 500 must be maintained.");
        } else {
            super.withdraw(amount);
        }
    }

    // Interest calculation
    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: " + interest + " | New Balance: " + balance);
    }
}

// Utility class for fund transfer
class BankUtility {
    public static void transferFunds(BankAccount from, BankAccount to, double amount) {
        if (amount <= from.balance) {
            from.withdraw(amount);
            to.deposit(amount);
            System.out.println("Transferred " + amount + " from " + from.accountHolder + " to " + to.accountHolder);
        } else {
            System.out.println("Transfer failed. Insufficient funds in source account.");
        }
    }
}

// Main class
public class BankAcc {
    public static void main(String[] args) {
        // Create accounts
        BankAccount acc1 = new BankAccount("Alice", 101, 2000);
        SavingsAccount acc2 = new SavingsAccount("Bob", 102, 3000, 5);

        // Display accounts
        acc1.displayAccount();
        acc2.displayAccount();

        // Perform operations
        acc1.deposit(500);
        acc1.withdraw(1000);

        acc2.deposit(1000);
        acc2.withdraw(2700); // Will check minimum balance
        acc2.calculateInterest();

        // Fund transfer
        BankUtility.transferFunds(acc1, acc2, 500);

        // Final account details
        acc1.displayAccount();
        acc2.displayAccount();
    }
}


