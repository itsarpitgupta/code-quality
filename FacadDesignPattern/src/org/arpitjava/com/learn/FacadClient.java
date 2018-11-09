package org.arpitjava.com.learn;

public class FacadClient {

	Phone iPhone;
	Phone nokia;
	Phone onePlus;

	public FacadClient() {
		iPhone = new IPhone();
		nokia = new Nokia();
		onePlus = new OnePlus();
	}

	public String buildIPhone() {
		return iPhone.buildPhone();
	}

	public String buildNokia() {
		return nokia.buildPhone();
	}

	public String buildOnePlus() {
		return onePlus.buildPhone();
	}
}
