package ch08;


public class Restaurant {
	public long orderReceiveNumber;	//�ֹ�������ȣ
	public int orderPhoneNumber;	//�ֹ��ڵ�����ȣ
	public String orderAdress;		//�ֹ� �ּ�
	public int orderDate;			//�ֹ���¥
	public int orderTime;			//�ֹ��ð�
	public int orderPrice;			//�ֹ�����
	public int menuNumber;			//�޴���ȣ
	
	public Restaurant(long orderReceiveNumber, int orderPhoneNumber, String orderAdress
						, int orderDate, int orderTime, int orderPrice, int menuNumber) {
		this.orderReceiveNumber = orderReceiveNumber;
		this.orderPhoneNumber = orderPhoneNumber;
		this.orderAdress = orderAdress;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		this.menuNumber = menuNumber;
	}
	
	public void showRestaurant() {
		System.out.println("�������� ��� �ֹ��� ���Խ��ϴ�.");
		System.out.println("�ֹ� ���� ��ȣ :"+ orderReceiveNumber);
		System.out.println("�ֹ� �ڵ��� ��ȣ "+ orderPhoneNumber);
		System.out.println("�ֹ� �� �ּ� :"+ orderAdress);
		System.out.println("�ֹ� ��¥ :" + orderDate);
		System.out.println("�ֹ� �ð� : "+ orderTime);
		System.out.println("�ֹ� ���� : "+ orderPrice);
		System.out.println("�޴� ��ȣ : "+ menuNumber);
	}
	
}
