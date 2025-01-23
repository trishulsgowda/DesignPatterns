package com.state;

public interface State {

	public void insertCoin(VendingMachine vendingMachine);
	public void selectProduct(VendingMachine vendingMachine);
	public void confirmProductSelection(VendingMachine vendingMachine);
	public void dispenseProduct(VendingMachine vendingMachine);
}
