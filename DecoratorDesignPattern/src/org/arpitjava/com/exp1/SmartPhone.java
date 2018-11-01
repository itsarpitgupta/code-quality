package org.arpitjava.com.exp1;

// Decorator
public abstract class SmartPhone implements Phone {

	private final Phone phone;

	SmartPhone(Phone phone) {
		this.phone = phone;
	}

	public String build() {
		return phone.build();
	}
	
}
