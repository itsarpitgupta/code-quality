package org.arpitjava.com.exp1;

public class Nokia extends SmartPhone {

	Nokia(Phone phone) {
		super(phone);
	}

	public String build() {
		return super.build() + addBranding();
	}

	private String addBranding() {
		return "Nokia Branding";
	}

}
