package org.arpitjava.com;

public class AndroideRules implements RuleI<Phone, Phone> {

	@Override
	public Phone process(Phone intput) {
		intput.setModel("Google Pix 2");
		return intput;
	}

	@Override
	public boolean matches(OSType type) {
		return type.equals(OSType.ANDROIDE);
	}

}
