package org.arpitjava.com;

public class Client {

	public static void main(String[] args) {
		/*Singleton instance2 = Singleton.getInstance();
		System.out.println(instance2);
		*/
		new Thread(new Runnable() {
			public void run() {
				Singleton instance = Singleton.getInstance();
				System.out.println(instance);
				
			}
		}).start();
		
		new Thread(new Runnable() {
			public void run() {
				Singleton instance = Singleton.getInstance();
				System.out.println(instance);
				
			}
		}).start();
		
	}
}
