package ch19;

import ch18.Company;

public class CarFactory {
	private static CarFactory instance = new CarFactory();
	String carId;
	
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}

	public static void setInstance(CarFactory instance) {
		CarFactory.instance = instance;
	}
	
	public Car createCar() {
		Car car = new Car();
		return car;
	}
}
