package org.arpitjava.com.learn;

public class Bike extends Vehical {

	public Bike(Workshop wk1, Workshop wk2) {
		super(wk1,wk2);
	}

	@Override
	public void manufacture() {
		System.out.println("Bike");
		this.workshop1.work();
		this.workshop2.work();
	}

}
