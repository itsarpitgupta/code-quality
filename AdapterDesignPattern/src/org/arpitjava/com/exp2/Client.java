package org.arpitjava.com.exp2;

public class Client implements ITarget {

	@Override
	public void request() {
		System.out.println("client request");
	}

}
