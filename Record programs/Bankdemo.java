
import java.util.Scanner;

// Base class
class RBI {
    public double getRateOfInterest() {
        return 4.0;
    }
}

// SBI class
class SBI extends RBI {
    @Override
    public double getRateOfInterest() {
        return 7.0;
    }
}

// ICICI class
class ICICI extends RBI {
    @Override
    public double getRateOfInterest() {
        return 6.0;
    }
}

// PNB class
class PNB extends RBI {
    @Override
    public double getRateOfInterest() {
        return 6.5;
    }
}

// Customer class
class Customer {
    String name;
    int customerId;

    Customer(String name, int customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    public void displayCustomerInfo() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer ID: " + customerId);
    }
}

// Account class
class Account {
    Customer customer;
    RBI bank;

    Account(Customer customer, RBI bank) {
        this.customer = customer;
        this.bank = bank;
    }

    public void displayAccountInfo() {
        customer.displayCustomerInfo();
        System.out.println(
            "Rate of Interest: " + bank.getRateOfInterest() + "%"
        );
    }
}

// Main class
public class Bankdemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(
            "Enter the Bank name to find the rate of Interest: "
        );

        String bankName = sc.nextLine();

        RBI bank;

        switch (bankName.toUpperCase()) {

            case "SBI":
                bank = new SBI();
                break;

            case "ICICI":
                bank = new ICICI();
                break;

            case "PNB":
                bank = new PNB();
                break;

            case "RBI":
                bank = new RBI();
                break;

            default:
                System.out.println("Invalid bank name.");
                sc.close();
                return;
        }

        System.out.println(
            bankName.toUpperCase()
            + " rate of interest is: "
            + bank.getRateOfInterest()
            + "%"
        );

        sc.close();
    }
}
