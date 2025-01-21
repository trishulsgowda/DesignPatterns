package com.facade;

public class OrderFacade {
	
	ProductDAO productDAO;
	Payment payment;
	Invoice invoice;
	SendNotification sendNotification;
	
	public OrderFacade() {
		productDAO = new ProductDAO();
		payment = new Payment();
		invoice = new Invoice();
		sendNotification = new SendNotification();
	}

	public void createOrder(){
		productDAO.getProduct();
		payment.makePayment();
		invoice.makeInvoice();
		sendNotification.sendNotification();
	}
}
