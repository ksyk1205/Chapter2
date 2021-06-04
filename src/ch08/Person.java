package ch08;

public class Person {
	
	public int height; //키
	public int weight; //몸무게
	public String name; //이름
	public int age; //나이
	
	
	public Person(int height, int weight, String name, int age) {
		this.height = height;
		this.weight = weight;
		this.name = name;
		this.age = age;
	}
	
	public void showperson() {
		System.out.println("키가"+height+"이고 몸무게가"+weight+"킬로인 남성이 있습니다."
				+ " 이름은" + name+"이고 나이는 "+age+"세 입니다.");
	}

}
