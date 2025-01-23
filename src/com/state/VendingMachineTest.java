package com.state;

public class VendingMachineTest {

	public static void main(String[] args) {
		VendingMachine vendingMachine = new VendingMachine();
		
		State state = vendingMachine.getState();
		state.insertCoin(vendingMachine);
		
		state = vendingMachine.getState();
		
		state.selectProduct(vendingMachine);
		state = vendingMachine.getState();
		
		state.confirmProductSelection(vendingMachine);
		state = vendingMachine.getState();
		
		state.dispenseProduct(vendingMachine);
	}
}
