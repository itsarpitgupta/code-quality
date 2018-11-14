package org.arpitjava.com.learn;

public class BusinessException extends Exception {

	private int code;

	public BusinessException(String message, int code) {
		super(message);
		this.code = code;
	}

	public BusinessException(Throwable cause, int code) {
		super(cause);
		this.code = code;
	}

	public int getCode() {
		return code;
	}
}
