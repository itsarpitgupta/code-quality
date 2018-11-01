package org.arpitjava.com.exp1;

public class WindowsPhone extends SmartPhone {

	WindowsPhone(Phone phone) {
		super(phone);
	}
	
	@Override
	public String build() {
		return super.build() + addOS();
	}

	private String addOS() {
		return "Windows OS v1.0";
	}

}
