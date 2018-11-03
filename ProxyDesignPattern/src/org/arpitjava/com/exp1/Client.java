package org.arpitjava.com.exp1;

public class Client {

	public static void main(String[] args) {
		LazyBookParserProxy parser = new LazyBookParserProxy("Arpit");
		System.out.println("Num of Lines :"+parser.getNumLines());
		System.out.println("Num of Pages :"+parser.getNumPages());
	}
}
