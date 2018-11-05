package org.arpitjava.com.client;

public class Test {

	public static void main(String[] args) {
		Factory factory = StatementFactory.getStatementFactory(); 
		Statement statement = factory.getStatement(StatementType.MINI);
		statement.createStatement();
	}

}
