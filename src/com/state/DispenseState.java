package com.state;

public class DispenseState implements State {

	@Override
	public void insertCoin(VendingMachine vendingMachine) {
		System.out.println("Unsupported Operation");

	}

	@Override
	public void selectProduct(VendingMachine vendingMachine) {
		System.out.println("Unsupported Operation");

	}

	@Override
	public void confirmProductSelection(VendingMachine vendingMachine) {
		System.out.println("Unsupported Operation");

	}

	@Override
	public void dispenseProduct(VendingMachine vendingMachine) {
		System.out.println("Product Dispensed! Thank you!");
		vendingMachine.setState(new IdleState());
	}

}
