class Addition {
    int x=10;
    int y=20;
    void add() {
    int sum=x+y;
    System.out.println("Sum =" + sum);
    }
}
class Result extends Addition{
    void display() {
        add();
    }

} 
public class Singleinheritance {
public static void main(String[] args) {
    Result r= new Result();
    r.display();
}
}
