package com.observer;

public class ObserverTest {

	public static void main(String[] args) {
		Observable observable = new StockPriceObservable(100.00);
		
		Observer observer1 = new Observer1(observable);
		observable.add(observer1);
		
		
		observable.setData(99.00);
		observable.setData(99.00);
		observable.setData(92.00);
		observable.setData(95.00);
		observable.setData(80.00);
		observable.setData(88.00);
		observable.setData(102.00);
	}
}
