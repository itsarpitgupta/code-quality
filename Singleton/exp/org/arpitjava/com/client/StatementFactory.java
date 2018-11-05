package org.arpitjava.com.client;

public class StatementFactory implements Factory {

	private static Factory factory;

	private StatementFactory() {

	}

	public static Factory getStatementFactory() {
		if (factory == null) {
			synchronized (StatementFactory.class) {
				if (factory == null) {
					factory = new StatementFactory();
				}
			}
		}
		return factory;
	}

	@Override
	public Statement getStatement(StatementType type) {
		switch (type) {
		case MINI:
			return new MiniStatement();
		case DETAIL:
			return new DetailStatement();
		default:
			break;
		}
		return null;
	}

}
