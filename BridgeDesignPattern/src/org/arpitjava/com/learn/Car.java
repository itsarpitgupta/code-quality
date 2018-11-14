package org.arpitjava.com.learn;

public class Car extends Vehical {

	public Car(Workshop wk1, Workshop wk2) {
		super(wk1,wk2);
	}

	@Override
	public void manufacture() {
		System.out.println("Car");
		this.workshop1.work();
		this.workshop2.work();
	}

}
