package exceptions;
import java.util.Arrays;
import java.util.List;
public class UnException {
	public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30);
        try {
            list.add(40);
        }
        catch (UnsupportedOperationException e) {
            System.out.println("Add operation is not supported");
        }
    }
}
