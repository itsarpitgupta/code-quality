package org.arpitjava.com.exp2;

public class Adapter implements ITarget {
	private Adaptee adaptee;
	public Adapter(Adaptee adaptee) {
		this.adaptee=adaptee;
	}

	@Override
	public void request() {
		adaptee.specificRequest();
	}

}
