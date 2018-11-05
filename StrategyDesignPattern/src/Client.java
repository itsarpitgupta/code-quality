
public class Client {

	public static void main(String[] args) {
		Duck duck = new Duck(new SimpleFlying(), new NoQuarcking());
		duck.display();
		duck.fly();
		duck.quarck();
	}
}
