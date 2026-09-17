
import java.util.Scanner;

// Abstract class
abstract class Employee {
    String empId;

    Employee(String empId) {
        this.empId = empId;
    }

    public abstract void displaySalaryDetails();
}

// Regular Employee
class RegularEmployee extends Employee {

    private double basicPay = 25000;
    private double hra = 15000;
    private double ta = 5000;

    RegularEmployee(String empId) {
        super(empId);
    }

    @Override
    public void displaySalaryDetails() {
        double total = basicPay + hra + ta;

        System.out.println("Salary Details:");
        System.out.println("Employee ID: " + empId);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("HRA: " + hra);
        System.out.println("T.A: " + ta);
        System.out.println("Total Amount: " + total);
    }
}

// Contract Employee
class ContractEmployee extends Employee {

    private double basicPay = 12000;
    private double ta = 3000;

    ContractEmployee(String empId) {
        super(empId);
    }

    @Override
    public void displaySalaryDetails() {
        double total = basicPay + ta;

        System.out.println("Salary Details:");
        System.out.println("Employee ID: " + empId);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("T.A: " + ta);
        System.out.println("Total Amount: " + total);
    }
}

// Vendor
class Vendor extends Employee {

    Vendor(String empId) {
        super(empId);
    }

    @Override
    public void displaySalaryDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Vendors are not part of payroll system.");
    }
}

// Main class
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Id: ");
        String empId = sc.nextLine();

        Employee emp;

        if (empId.startsWith("R")) {
            emp = new RegularEmployee(empId);
        } 
        else if (empId.startsWith("C")) {
            emp = new ContractEmployee(empId);
        } 
        else {
            emp = new Vendor(empId);
        }

        emp.displaySalaryDetails();

        sc.close();
    }
}


