package interfaces;
interface inter1{
	 int x=10;
	void see();
}
interface  inter2{
	int z=15;
	void saw();
}
class tech{
	void shows() {
		System.out.println("shoe the data");
	}
}
class techs extends tech implements inter1,inter2{
	@Override
	public void see() {
		System.out.println("print inter1");
	}
	public void saw() {
		System.out.println("print inter2");
	}
}
public class Sample {
public static void main(String[] args) {
	techs t = new techs();
	t.shows();
	t.saw();
	t.see();
}
}
