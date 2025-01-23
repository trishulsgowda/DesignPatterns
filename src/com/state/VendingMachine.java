package com.state;

public class VendingMachine {

	State state;
	
	public VendingMachine() {
		this.state = new IdleState();
	}
	
	public void setState(State state){
		this.state = state;
	}
	
	public State getState(){
		return this.state;
	}
}
