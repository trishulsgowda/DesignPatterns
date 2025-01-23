package com.observer;

public interface Observable {

	public void add(Observer observer);
	public void remove(Observer observer);
	public void notifyObservers();
	public void setData(double data);
	public double getData();
}
