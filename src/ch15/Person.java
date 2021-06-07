package ch15;

public class Person {
	int money;
	String name;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;		
	}
	
	public void showPerson() {
		System.out.println(name+"¥‘¿« ≥≤¿∫ µ∑¿∫ "+money+"¿‘¥œ¥Ÿ.");
	}
}
