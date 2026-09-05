package exceptions;
public class CcException {
	public static void main(String[] args) {
		Object obj = "aa";
		try {
			// aa is not a integer
			Integer num = (Integer) obj;
			 System.out.println(num);
		}
		catch(ClassCastException e) {
			System.out.println("invalid type casting");
		}
	}
}
