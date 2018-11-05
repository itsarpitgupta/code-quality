
public class Duck {

	IFlyingBehaviour flyingBehaviour;
	IQuarckingBehaviour quarckingBehaviour;

	public Duck(IFlyingBehaviour flyingBehaviour, IQuarckingBehaviour quarckingBehaviour) {
		super();
		this.flyingBehaviour = flyingBehaviour;
		this.quarckingBehaviour = quarckingBehaviour;
	}


	public void fly() {
		flyingBehaviour.fly();
	}

	public void display() {
		System.out.println("duck display..");
	}

	public void quarck() {
		quarckingBehaviour.quarck();
	}

}
