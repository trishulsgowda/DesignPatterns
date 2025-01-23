package com.observer;

import java.util.ArrayList;
import java.util.List;
import com.observer.Observable;

public class StockPriceObservable implements Observable {

	List<Observer> observersList;
	double stockPrice;
	
	public StockPriceObservable(double initialStockPrice) {
		this.observersList = new ArrayList<>();
		this.stockPrice = initialStockPrice;
	}

	@Override
	public void add(Observer observer) {
		this.observersList.add(observer);
	}

	@Override
	public void remove(Observer observer) {
		this.observersList.remove(observer);
	}

	@Override
	public void notifyObservers() {
		this.observersList.forEach(observer -> observer.update());
	}
	
	public void setData(double latestStockPrice){
		if(latestStockPrice > this.stockPrice){
			this.stockPrice = latestStockPrice;
			notifyObservers();
		}
	}

	public double getData() {
		return stockPrice;
	}
	
}
