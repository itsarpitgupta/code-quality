package org.arpitjava.com.exp2;

public class MainTest {

	public static void main(String[] args) {
		ITarget target = new Client();
		target.request();

		Adaptee adaptee = new Adaptee();
		adaptee.specificRequest();

		target = new Adapter(adaptee);
		target.request();

	}

}
