package Excersice;
class Order{
	public String date;
	public String number;
	public Order(String date,String number) {
		this.date=date;
		this.number=number;
	}
    public void confirm() {
    	System.out.println("order"+number+"confirmed");
    }
    public void close() {
    	System.out.println("order"+number+"closed");
    }
	public String getDate () {
		return date;
	}
    public void setDate (String date) {
    	this.date=date;
    }
    public String getNumber() {
    	return number;
    }
    public void setNumber(String number) {
    	this.number=number;
    }
}
class SpecialOrder extends Order{
	SpecialOrder(String date,String number){
		super(date,number);
	}
	public void dispatch() {
		System.out.println("Special order " + number + " dispatched");
		}
}
class NormalOrder extends Order{
	NormalOrder(String date,String number){
		super(date,number);
	}
	public void dispatch() {
		System.out.println("Normal order " + number + " dispatched");
		}
	public void recive() {
		System.out.println("Normal order"+ number + " recived");
	}
}
class customer{
	private String name;
	private String location;
      customer(String name, String location) { 
		this.name = name;
		this.location = location;
		}
	public void sendOrder(Order order) {
		System.out.println(name+ "" +"from"+""+location+""+"sent an order");
		}
	public void receiveOrder(Order order) { 
		System.out.println(name+"" +"received order");
		}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
}
public class MainOrder {
public static void main(String[] args) {
	customer c = new customer("joe","anits");
	 SpecialOrder s = new  SpecialOrder("13 augest","sp-1");
	 c.sendOrder(s);
	 s.confirm();
	 s.dispatch();
	 c.receiveOrder(s);
	 s.close();
	 NormalOrder n = new NormalOrder("16 augest","no-1");
	 n.confirm();
	 n.dispatch();
	 c.receiveOrder(n);
	 n.recive();
	 n.close();
	 c.receiveOrder(s);
  }
}
