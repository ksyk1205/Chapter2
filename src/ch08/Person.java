package ch08;

public class Person {
	
	public int height; //Ű
	public int weight; //������
	public String name; //�̸�
	public int age; //����
	
	
	public Person(int height, int weight, String name, int age) {
		this.height = height;
		this.weight = weight;
		this.name = name;
		this.age = age;
	}
	
	public void showperson() {
		System.out.println("Ű��"+height+"�̰� �����԰�"+weight+"ų���� ������ �ֽ��ϴ�."
				+ " �̸���" + name+"�̰� ���̴� "+age+"�� �Դϴ�.");
	}

}
