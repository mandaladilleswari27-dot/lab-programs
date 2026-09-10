 class Ignore {

    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Hello";
        String str3 = "java";

        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str2.equalsIgnoreCase(str3));
    }
}

