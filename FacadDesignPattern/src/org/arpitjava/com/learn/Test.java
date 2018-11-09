package org.arpitjava.com.learn;

public class Test {

	public static void main(String[] args) {
		FacadClient client = new FacadClient();
		System.out.println(client.buildIPhone());
		System.out.println(client.buildNokia());
		System.out.println(client.buildOnePlus());
		
	}
}
