public class Array {
    public static void main(String[] args) {
        int x[] = {10, 20, 30, 40, 50};
        System.out.println("Array elements:");
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
        System.out.println("Array elements multiplied by 2:");
        for (int b : x) {
            System.out.println(b * 2);
        }
        int y[] = new int[5];
        for (int i = 0; i < y.length; i++) {
            y[i] = (i + 1) * 10;
        }
        System.out.println("Static array elements:");
        for (int value : y) {
            System.out.println(value);
        }
    }
}