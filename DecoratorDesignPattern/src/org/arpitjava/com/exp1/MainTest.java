package org.arpitjava.com.exp1;

public class MainTest {

	public static void main(String[] args) {
		Phone basicPhone = new BasicPhone();
		System.out.println(basicPhone.build());
		
		Phone androidSmartPhone = new AndroidPhone(basicPhone);
		System.out.println(androidSmartPhone.build());
		
		Phone nokiaPhone = new Nokia(new WindowsPhone(new BasicPhone()));
		System.out.println(nokiaPhone.build());
		
	}
}
