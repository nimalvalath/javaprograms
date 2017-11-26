abstract class Flyable{// if any member is abstract 
	// then the class should be abstract

	public abstract void start();
	abstract public void fly();
	public abstract void land();	// abstract members

	public void doSomething(){		// concreate members are allowed here
	
		System.out.println("this id doing doSomething");
	
	}
}
