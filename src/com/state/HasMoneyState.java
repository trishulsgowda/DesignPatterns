package com.state;

public class HasMoneyState implements State {

	@Override
	public void insertCoin(VendingMachine vendingMachine) {
		System.out.println("Unsupported Operation");
	}

	@Override
	public void selectProduct(VendingMachine vendingMachine) {
		System.out.println("Select Product..");
		vendingMachine.setState(new SelectionState());
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
