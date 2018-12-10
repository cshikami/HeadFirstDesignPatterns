package Strategy;

public class DeviceQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Hunter quack!");
	}

}
