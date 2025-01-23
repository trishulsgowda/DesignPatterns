package com.state;

public class SelectionState implements State {

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
		System.out.println("Confirm Product.");
		vendingMachine.setState(new DispenseState());
	}

	@Override
	public void dispenseProduct(VendingMachine vendingMachine) {
		System.out.println("Unsupported Operation");

	}

}
