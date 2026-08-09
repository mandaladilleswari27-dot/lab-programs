package inheritance;
class One{
	int  x=27;
	 void show() {
		 System.out.println("this is one");	
	 }
}
class Two extends One {
	 int y= 34;
	 void see () {
		 System.out.println("see :"+super.x+ " "+this.y);
	 }
}
public class Single {
public static void main(String[] args) {
	Two t = new Two();
	t.see();
	t.show();
}
}
