package com.state;

public class IdleState implements State {

	@Override
	public void insertCoin(VendingMachine vendingMachine) {
		System.out.println("Insert Coins");
		System.out.println("Coins inserted successfully");
		vendingMachine.setState(new HasMoneyState());
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
		System.out.println("Unsupported Operation");
	}

}
