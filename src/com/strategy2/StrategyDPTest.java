package com.strategy2;

public class StrategyDPTest {

	public static void main(String[] args) {
		Vehicle v1 = new PassengerVehicle(new NormalModeStrategy());
		v1.drive();
		
		Vehicle v2 = new SportsVehicle(new PowerModeStrategy());
		v2.drive();
	}
}
