package inheritance;
class p1{
	int  x=27;
	 void show() {
		 System.out.println("this is one");	
	 }
 }
 class p2 extends p1 {
	 int y= 34;
	 void see () {
		 System.out.println("see :"+super.x+ " "+this.y);
	 }
 }
class p3 extends p2{
	 int z=12;
	 void demo() {
		 System.out.println("see :"+super.x+ " "+super.y+ " "+this.z);
	 }
}
 class p4 extends p1{
	 int z=12;
	 void demos() {
		 System.out.println("see :"+super.x+ " "+this.z);
	 }
 }
public class Hybrid {
public static void main(String[] args) {
	p3 p = new p3();
	p.demo();
	p3 s = new p3();
	s.demos();
}
}
