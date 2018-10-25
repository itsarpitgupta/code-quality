package org.arpitjava.com;

import java.util.ArrayList;
import java.util.List;

public class RuleEngine {
	List<RuleI<Phone, Phone>> rules;

	public RuleEngine() {
		rules = new ArrayList<>();
	}

	Phone applyRule(Phone phone) {
		return rules.stream().filter(rule -> rule.matches(phone.getOsType())).map(rule -> rule.process(phone))
				.findFirst().orElseThrow(() -> new RuntimeException("No Rule Found"));
	}

	RuleEngine registerRule(RuleI<Phone, Phone> rule) {
		rules.add(rule);
		return this;
	}
}
