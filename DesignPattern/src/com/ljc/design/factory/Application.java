package com.ljc.design.factory;

public class Application {
	public static void main(String[] args) {
		HavalCarFactory havalFactory = new HavalCarFactory();
		TrumpchiCarFactory trumpchiCarFactory = new TrumpchiCarFactory();
		
		Car car1 = havalFactory.createCar();
		
		Car car2 = trumpchiCarFactory.createCar();
		
		car1.printCarId();
		
		car2.printCarId();
		
		System.exit(0);
	}
}
