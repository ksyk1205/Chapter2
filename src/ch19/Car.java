package ch19;

public class Car {
	private static int seriaNum = 10000;
	private int carNum;
	
	public Car() {
		seriaNum++;
		carNum = seriaNum;
	}
	
	public int getCarNum() {
		return carNum;
	}
	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}


	
}
