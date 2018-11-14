package org.arpitjava.com.learn;

public enum ExceptionMessages {

	AGE_NOT_VALID_EXCEPTION(1000, "Age should be greater then 18");

	private final int code;
	private final String message;

	private ExceptionMessages(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

}
