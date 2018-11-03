package org.arpitjava.com;

public class Client {

	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		System.out.println(instance);
		
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance2);
		
		
	}
}
