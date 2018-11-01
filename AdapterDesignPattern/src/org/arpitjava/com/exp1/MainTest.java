package org.arpitjava.com.exp1;

public class MainTest {

	public static void main(String[] args) {
		AndroidPhone op5 = new OP5();
		AndroidCharger androidCharger = new AndroidCharger();
		androidCharger.charge(op5);
		
		IPhone iphoneX = new IPhoneX();
		IPhoneCharger  iphoneCharger = new IPhoneCharger();
		iphoneCharger.charge(iphoneX);
		
		AndroidToIPhoneChargerAdapter adapter = new AndroidToIPhoneChargerAdapter(op5);
		adapter.charge();
		
	}

}
