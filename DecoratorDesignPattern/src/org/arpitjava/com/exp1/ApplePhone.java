package org.arpitjava.com.exp1;

public class ApplePhone extends SmartPhone {

	ApplePhone(Phone phone) {
		super(phone);
	}

	@Override
	public String build() {
		return super.build() + addOS();
	}

	private String addOS() {
		return "IOS v1.0";
	}

}
