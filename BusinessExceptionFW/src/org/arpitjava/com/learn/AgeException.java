package org.arpitjava.com.learn;

public class AgeException extends BusinessException {

	public AgeException(String message, int code) {
		super(message, code);
	}

	public AgeException(Throwable cause, int code) {
		super(cause, code);
	}

}
