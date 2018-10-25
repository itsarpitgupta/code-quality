package org.arpitjava.com;

public class IPhoneRules implements RuleI<Phone, Phone> {

	@Override
	public Phone process(Phone intput) {
		intput.setModel("IPhone X");
		return intput;
	}
	
	@Override
	public boolean matches(OSType type) {
		return type.equals(OSType.IPHONE);
	}
}
