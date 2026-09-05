package exceptions;
class StringIndexOutOfBound_Demo
{
    public static void main(String args[])
    {
        try {
            String a = "My name is likitha"; // length is 15
            char c = a.charAt(20); // accessing 20th element
            System.out.println(c);
        }
        catch(StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException");
        }
    }
}
