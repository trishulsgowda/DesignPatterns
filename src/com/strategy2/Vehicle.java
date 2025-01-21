package com.strategy2;

public class Vehicle {
	
	DrivingStrategy drivingStrategy;
	
	public Vehicle(DrivingStrategy drivingStrategy) {
		this.drivingStrategy = drivingStrategy;
	}

	public void drive(){
		this.drivingStrategy.drive();
	}
}
