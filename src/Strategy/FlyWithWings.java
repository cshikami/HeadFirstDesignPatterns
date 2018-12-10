package Strategy;

/**
 * Flying behavior implementation for ducks that DO fly
 * @author christopher_shikami
 *
 */
public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I'm flying!");
	}
}
