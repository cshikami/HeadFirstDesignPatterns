package Strategy;

public abstract class Person {
	QuackBehavior quackBehavior;
	
	public Person() { }
	
	public abstract void display();
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
}
