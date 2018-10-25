package org.arpitjava.com;

public interface RuleI<I,O> {

	boolean matches(OSType type);
	O process(I intput);
}
