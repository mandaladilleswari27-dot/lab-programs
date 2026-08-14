package Excersice;
class farmanimals{
	String name;
	String place;
	String food;
	String sound;
	farmanimals(String k,String l,String m,String n){
		this.name=k;
		this.place=l;
		this.food=m;
		this.sound=n;
	}
	void animal() {
		System.out.println("animal :"+name);
		System.out.println("where it stays:"+place);
		System.out.println("what it eats:"+food);
		System.out.println("who it sounds"+sound);
	}
}
public class FarmingAnimals {
	public static void main(String[] args) {
		farmanimals cow = new farmanimals("cow","shed","grass","moo");
		farmanimals horse = new farmanimals("horse","stable","hay","neigh");
		farmanimals pig = new farmanimals("pig","pigsty","grains","oink");
		cow.animal();
		horse.animal();
		pig.animal();
	}
}
