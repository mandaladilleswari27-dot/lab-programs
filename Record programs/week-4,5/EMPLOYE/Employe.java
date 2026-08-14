package Excersice;
class worker{
	String name;
	int id;
	String designation;
    double salary;
    boolean promotionStatus;
	 worker() {
		this.name = "Not Assigned";
		this.id = 0;
		this.designation = "Not Assigned";
		this.salary = 0.0;
		this.promotionStatus = false;
	}
	 worker(String name, int id, String designation) {
		this.name = name;
		this.id = id;
		this.designation = designation;
		this.salary = 0.0;
		this.promotionStatus = false;
		}
	 worker(String name, int id, String designation, double salary) {
		this.name = name;
		this.id = id;
		this.designation = designation;
		this.salary = salary;
		this.promotionStatus = false;
		}
	 worker(String name, int id, String designation, double salary, boolean promotionStatus) {
		this.name = name;
		this.id = id;
		this.designation = designation;
		this.salary = salary;
		this.promotionStatus = promotionStatus;
	}
	void display() {
        System.out.println("Employee Name      : " + name);
        System.out.println("Employee ID        : " + id);
        System.out.println("Designation        : " + designation);
        System.out.println("Salary             : " + salary);
        System.out.println("Promotion Status   : " + promotionStatus);
        System.out.println("-------------------------------------");
    }

}
public class Employe {
 public static void main(String[] args) {
	 worker w1 = new worker();
	 worker w2 = new worker("Rahul", 101, "Software Engineer");
	 worker w3 = new worker("Priya", 102, "Software Engineer", 50000);
	 worker w4 = new worker("Arun", 103, "Manager", 80000, true);
     w1.display();
     w2.display();
     w3.display();
     w4.display();

}
}
