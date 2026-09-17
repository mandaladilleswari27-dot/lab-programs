package interfaces;
interface likitha{
	 int x=10;
	void see();
}
interface vyshu extends likitha {
	int z=15;
	void show();
}
class zoya implements vyshu{
	@Override
	 public void see() {
		System.out.println("prt likitha");
	}
	@Override
	public void lucky() {
		System.out.println("prt vyshu");
	}
}
public class Simple {
public static void main(String[] args) {
	zoya z=new zoya();
	z.see();
	z.show();
}
}
