package ch15;

public class Taxi {
	int money;
	String TaxiName;
	
	public Taxi(String TaxiName) {
		this.TaxiName = TaxiName;
	}
	
	public void take(int money) {
		this.money += money;
	}
	
	public void showTaxi() {
		System.out.println(TaxiName+"�ý��� ������"+money+"�Դϴ�.");
	}
}
