package org.arpitjava.com.client;

public interface Factory {

	public Statement getStatement(StatementType type);
}
