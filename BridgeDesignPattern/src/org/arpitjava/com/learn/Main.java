package org.arpitjava.com.learn;

public class Main {

	public static void main(String[] args) {
		
		Vehical vehical1 = new Car(new Produce(),new Assemble());
		vehical1.manufacture();
	}
}
