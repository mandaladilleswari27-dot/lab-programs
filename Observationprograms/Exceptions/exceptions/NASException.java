package exceptions;
public class NASException{
	public static void main(String[] args) {
	try {
    	//size cannot be negative it has to be either 0 or 1,2,-----
        int size = -5;
        int[] numbers = new int[size];
        System.out.println("Array created");
    }
    catch (NegativeArraySizeException e) {
        System.out.println("Array size cannot be negative");
    }
}
}
