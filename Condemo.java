public class Condemo{
    int rollno;
    String name;
    float fee;
    public Condemo(int i,String n,float f){
    this.rollno=i;
    this.name=n;
    this.fee=f;
    }
    void display(){
        System.out.println("Test method");
        System.out.println("Rollno is:" + this.rollno);
        System.out.println("Name is :" + this.name);
        System.out.println("Fee:" + this.fee);
    }

    public static void main(String[] args){
       System.out.println("Hello CSM D");
       Condemo cd = new Condemo(121,"Priya",233.13f);
       cd.display();
       
    } 
}