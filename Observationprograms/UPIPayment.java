
import java.util.Scanner;

// Interface
interface Payment {
    void addMoney(double amount);
    void makePayment(double amount);
    void checkBalance();
}

// Digital Wallet class implements the interface
class DigitalWallet implements Payment {

    private String ownerName;
    private String upiId;
    private double balance;

    // Constructor
    DigitalWallet(String ownerName, String upiId) {
        this.ownerName = ownerName;
        this.upiId = upiId;
        this.balance = 0;
    }

    // Add money to wallet
    public void addMoney(double amount) {
        try {
            if (amount <= 0) {
                throw new IllegalArgumentException("Amount must be greater than 0");
            }

            balance = balance + amount;

            System.out.println("Money Added: Rs." + amount);
            System.out.println("New Balance: Rs." + balance);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Make UPI payment
    public void makePayment(double amount) {
        try {
            if (amount <= 0) {
                throw new IllegalArgumentException(
                    "Payment amount must be greater than 0"
                );
            }

            if (amount > balance) {
                throw new Exception("Insufficient wallet balance");
            }

            balance = balance - amount;

            System.out.println("Payment Successful!");
            System.out.println("Paid: Rs." + amount);
            System.out.println("Remaining Balance: Rs." + balance);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Payment Failed: " + e.getMessage());
        }
    }

    // Check wallet balance
    public void checkBalance() {
        System.out.println("UPI ID: " + upiId);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Current Balance: Rs." + balance);
    }
}

// Main class
public class UPIPayment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Owner Name: ");
        String name = sc.nextLine();

        System.out.print("Enter UPI ID: ");
        String upi = sc.nextLine();

        // Creating wallet object
        DigitalWallet wallet = new DigitalWallet(name, upi);

        System.out.println("\n--- Digital Wallet Created ---");

        // Add money
        System.out.print("Enter amount to add: ");
        double addAmount = sc.nextDouble();

        wallet.addMoney(addAmount);

        // Make payment
        System.out.print("\nEnter amount to pay using UPI: ");
        double paymentAmount = sc.nextDouble();

        wallet.makePayment(paymentAmount);

        // Display final balance
        System.out.println("\n--- Wallet Details ---");
        wallet.checkBalance();

        sc.close();
    }
}

