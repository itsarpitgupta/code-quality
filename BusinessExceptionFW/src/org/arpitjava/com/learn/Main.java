package org.arpitjava.com.learn;

public class Main {

	public static void main(String[] args) throws Exception {

		BusinessService service = new BusinessService();
		try {
			service.validateAge(4);
			System.out.println("Valid Age");
		} catch (AgeException e) {
			throw new Exception(e);
		}
	}

}
