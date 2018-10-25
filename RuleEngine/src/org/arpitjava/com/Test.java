package org.arpitjava.com;

public class Test {

	public static void main(String[] args) {
		RuleEngine engine = new RuleEngine();
		engine.registerRule(new IPhoneRules()).registerRule(new AndroideRules());

		Phone iphone = new Phone(OSType.IPHONE);
		iphone = engine.applyRule(iphone);
		
		System.out.println(iphone);

	}
}
