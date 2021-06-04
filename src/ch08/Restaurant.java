package ch08;


public class Restaurant {
	public long orderReceiveNumber;	//주문접수번호
	public int orderPhoneNumber;	//주문핸드폰번호
	public String orderAdress;		//주문 주소
	public int orderDate;			//주문날짜
	public int orderTime;			//주문시간
	public int orderPrice;			//주문가격
	public int menuNumber;			//메뉴번호
	
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
		System.out.println("음식점에 배달 주문이 들어왔습니다.");
		System.out.println("주문 접수 번호 :"+ orderReceiveNumber);
		System.out.println("주문 핸드폰 번호 "+ orderPhoneNumber);
		System.out.println("주문 집 주소 :"+ orderAdress);
		System.out.println("주문 날짜 :" + orderDate);
		System.out.println("주문 시간 : "+ orderTime);
		System.out.println("주문 가격 : "+ orderPrice);
		System.out.println("메뉴 번호 : "+ menuNumber);
	}
	
}
