package org.arpitjava.com.learn;

public abstract class Vehical {

	protected Workshop workshop1;
	protected Workshop workshop2;

	public Vehical(Workshop wk, Workshop wk2) {
		this.workshop1 = wk;
		this.workshop2 = wk2;
	}

	abstract public void manufacture();
}
