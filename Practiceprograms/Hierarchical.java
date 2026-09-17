package inheritance;
class add{
	int  x=27;
	 void show() {
		 System.out.println("this is one");	
	 }
 }
 class sub extends add {
	 int y= 34;
	 void see () {
		 System.out.println("see :"+super.x+ " "+this.y);
	 }
 }
class smart extends add{
 int z=12;
 void demo(){
	 System.out.println("see :"+super.x+ " "+this.z);
 }
}
public class Hierarchical {
public static void main(String[] args) {
	sub u = new sub();
	smart s = new three();
	u.see();
	s.demo();
}
}
