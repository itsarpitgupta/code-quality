package org.arpitjava.com.exp1;

public class AndroidToIPhoneChargerAdapter implements IPhone{
	
	private AndroidPhone androidPhone;
	
	public AndroidToIPhoneChargerAdapter(AndroidPhone androidPhone) {
		this.androidPhone = androidPhone; 
	}

	@Override
	public void charge() {
		androidPhone.charge();
	}

}
