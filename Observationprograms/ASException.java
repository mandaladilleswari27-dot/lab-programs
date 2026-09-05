package exceptions;
public class ASException {
	public static void main(String[] args) {
		Object[] arr = new String[3];
	    try {
	        arr[0] = "Java";
	        arr[1] = "Python";
	        arr[2] = 10;//it is an integer
	    }
	    catch (ArrayStoreException e) {
	        System.out.println(e.getMessage());
	    }
	}
}
