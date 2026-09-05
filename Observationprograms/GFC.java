
class GFG {
    public static void main(String[] args)
    {
        try {
            int array[] = new int[] { 4, 1, 2, 6, 7 };
            // accessing element at index 4
            System.out.println("The element at index 4 is "
                               + array[4]);
            // accessing element at index 6
            // this will throw the
            // ArrayIndexOutOfBoundsException
            System.out.println("The element at index 6 is "
                               + array[6]);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}