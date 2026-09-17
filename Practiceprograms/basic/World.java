
public class World{
int  display(){
    int a=10,b=20;
    int c=a+b;
    System.out.println("Result:" + c);
     return(c);
    }
    public static void main(String[] args){
        World t=new World();
        System.out.println(t.display());
    }
}
