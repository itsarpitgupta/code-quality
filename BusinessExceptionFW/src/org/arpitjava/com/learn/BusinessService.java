package org.arpitjava.com.learn;

public class BusinessService {


	public void validateAge(int age) throws AgeException {
		if(age < 18) {
			throw new AgeException(ExceptionMessages.AGE_NOT_VALID_EXCEPTION.getMessage(), 1000);
		}
		
	}
}
