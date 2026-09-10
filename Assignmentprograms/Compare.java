class Compare {
    
    public static void main(String[] args) {
        String str1 = "Apple";
        String str2 = "Banana";
        String str3 = "Apple";

        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareTo(str1));
        System.out.println(str1.compareTo(str3));
    }
}


