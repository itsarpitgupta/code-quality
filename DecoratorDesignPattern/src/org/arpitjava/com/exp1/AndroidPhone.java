package org.arpitjava.com.exp1;

public class AndroidPhone extends SmartPhone {

	AndroidPhone(Phone phone) {
		super(phone);
	}

	@Override
	public String build() {
		return super.build() + addOS();
	}

	private String addOS() {
		return "Android OS v1.0";
	}

}
