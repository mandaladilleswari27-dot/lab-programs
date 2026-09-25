package Excersice;
import java.util.Scanner;
class Student {
    int rollNumber;
    String name;
    int[] marks;
    // Constructor
    Student(int rollNumber, String name, int[] marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }
    // Calculate total marks
    int calculateTotal() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }
    // Calculate average marks
    double calculateAverage() {
        return calculateTotal() / (double) marks.length;
    }
    // Find highest mark
    int findHighest() {
        int highest = marks[0];
        for (int mark : marks) {
            highest = Math.max(highest, mark);
        }
        return highest;
    }
    // Find lowest mark
    int findLowest() {
        int lowest = marks[0];
        for (int mark : marks) {
            lowest = Math.min(lowest, mark);
        }
        return lowest;
    }
    // Calculate percentage
    double calculatePercentage() {
        // Maximum marks = 5 subjects × 100
        double percentage = (calculateTotal() / 500.0) * 100;
        // Round to two decimal places using Math.round()
        return Math.round(percentage * 100.0) / 100.0;
    }
    // Determine grade
    String calculateGrade() {
        double percentage = calculatePercentage();
        if (percentage >= 90)
            return "A+";
        else if (percentage >= 80)
            return "A";
        else if (percentage >= 70)
            return "B";
        else if (percentage >= 60)
            return "C";
        else if (percentage >= 50)
            return "D";
        else
            return "F";
    }
    // Determine pass or fail
    String getResult() {
        if (calculatePercentage() >= 50)
            return "PASS";
        else
            return "FAIL";
    }
    // Performance remark
    String getRemark() {
        String grade = calculateGrade();
        switch (grade) {
            case "A+":
                return "Excellent Performance";
            case "A":
                return "Very Good Performance";
            case "B":
                return "Good Performance";
            case "C":
                return "Average Performance";
            case "D":
                return "Satisfactory Performance";
            default:
                return "Needs Improvement";
        }
    }
    // Display student details
    void displayDetails() {
        // String operations
        String formattedName = name.trim().toUpperCase();
        int nameLength = formattedName.length();
        System.out.println("\n========== STUDENT PERFORMANCE REPORT ==========");
        System.out.println("Roll Number       : " + rollNumber);
        System.out.println("Student Name      : " + formattedName);
        System.out.println("Name Length       : " + nameLength);
        System.out.println("\nSubject Marks:");
        for (int i = 0; i < marks.length; i++) {
        	System.out.println("Subject " + (i + 1) + "          : " + marks[i]);
        }
        System.out.println("\nTotal Marks       : " + calculateTotal());
        System.out.printf("Average Marks     : %.2f", calculateAverage());
        System.out.println("Highest Mark      : " + findHighest());
        System.out.println("Lowest Mark       : " + findLowest());
        System.out.printf("Percentage        : %.2f", calculatePercentage());
        System.out.println("Grade             : " + calculateGrade());
        System.out.println("Result            : " + getResult());
        System.out.println("Performance Remark: " + getRemark());
        System.out.println("===============================================");
    }
}
public class StudentPerformance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        int rollNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        int[] marks = new int[5];
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        // Create Student object
        Student student = new Student(rollNumber, name, marks);
        // Display complete performance report
        student.displayDetails();
        sc.close();
    }
}
