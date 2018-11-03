package org.arpitjava.com.exp1;

public class LazyBookParserProxy implements IBookParser {

	private BookParser bookParser;
	private String book;

	LazyBookParserProxy(String book) {
		this.book = book;
	}

	@Override
	public int getNumPages() {
		if(bookParser == null) {
			bookParser = new BookParser(book);
		}
		return bookParser.getNumPages();
	}

	@Override
	public int getNumLines() {
		if(bookParser == null) {
			bookParser = new BookParser(book);
		}
		return bookParser.getNumLines();
	}

}
