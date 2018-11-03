package org.arpitjava.com.exp1;

public class BookParser implements IBookParser {

	private String book;
	
	public BookParser(String book) { // creating the book parser object is very extensive process
		this.book = book;
	}
	
	@Override
	public int getNumPages() {
		return 3;
	}

	@Override
	public int getNumLines() {
		return 5;
	}

}
