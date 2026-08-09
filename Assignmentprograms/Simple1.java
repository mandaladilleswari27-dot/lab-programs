package interfaces;
interface I1{
	void ex();
}
interface I2{
	 void in();
}
interface I3 extends I1, I2{
	void lee();
}
class Raw implements I3{
	@Override
	public void ex() {
		System.out.println("this is from I1");
	}
	@Override
	public void in() {
		System.out.println("this is from I2");
	}
	@Override
	public void lee() {
		System.out.println("this is from I3");
	}
}
public class Simple1 {
public static void main(String[] args) {
	Raw a = new Raw();
	a.ex();
	a.in();
	a.lee();
}
}
 
