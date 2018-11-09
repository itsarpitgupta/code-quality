package org.arpitjava.com.learn;

public class MathOperation implements Adder,Subtracter {

	@Override
	public long add(long... ls) { // 4,5,6
		long result = 0;
		for (long l : ls) {
			result += l;
		}
		return result;
	}

	@Override
	public long subtract(long... ls) {
		long result = ls[0];
		for(int i=1 ; i<ls.length;i++) {
			result -= ls[i];
		}
		return result;
	}

}
