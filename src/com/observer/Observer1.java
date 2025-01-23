package com.observer;

public class Observer1 implements Observer {
	
	Observable stockPriceObservable;
	
	Observer1(Observable observable){
		this.stockPriceObservable = observable;
	}

	@Override
	public void update() {
		System.out.println("ALERT! Stock Price is increased. Current price is:"+ stockPriceObservable.getData());
	}

}
