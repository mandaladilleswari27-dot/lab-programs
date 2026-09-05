package exceptions;
class Student{
    String name;
}
public class NPE{
    public static void main (String[] args){
        Student s = null;
        System.out.println(s.name);
    }
}
