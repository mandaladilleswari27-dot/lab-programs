package exceptions;
class Printer{
boolean on = false;
void print() {  
    if (!on) {
        throw new IllegalStateException("Printer is turned off");
    }
    System.out.println("Printing...");
}
}
public class ISException {
	public static void main(String[] args) {
        Printer p = new Printer();
        try {
            p.print();
        }
        catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
