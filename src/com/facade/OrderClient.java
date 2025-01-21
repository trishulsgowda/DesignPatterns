package com.facade;

public class OrderClient {

	public void createOrder(){
		// The client relies on the facade for the complex logic.
		// If facade was not there client should have implemented all the logic
		OrderFacade orderFacade = new OrderFacade();
		orderFacade.createOrder();
	}
}
