package Strategy;

public class Hunter extends Person {
	
	
	public Hunter() {
		quackBehavior = new DeviceQuack();
	}
	
	@Override
	public void display() {
		System.out.println("I'm a hunter.");
	}

}
