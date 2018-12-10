package Strategy;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		mallardDuck.display();
		mallardDuck.performQuack();
		mallardDuck.performFly();
		
		Duck modelDuck = new ModelDuck();
		modelDuck.display();
		modelDuck.performFly();
		modelDuck.setFlyBehavior(new FlyRocketPowered());
		modelDuck.performFly();

		/**
		 * A duck call is a device that hunters use to mimic the calls
		 * (quacks) of ducks. How would you implement your own duck call
		 * that does not inherit from the Duck class?
		 * Answer: Create a Hunter class that inherits from a Person 
		 * class. The Hunter class inherits from Person class which 
		 * delegates from the QuackBehavior interface
		 */
		Person hunter = new Hunter();
		hunter.display();
		hunter.performQuack();
		//hunter duck call changed from device call to Quack class quack
		hunter.setQuackBehavior(new Quack());
		hunter.performQuack();
	}
}
