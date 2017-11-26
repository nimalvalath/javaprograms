//inheritance using -interface 
class Jet implements Flyable {

	@Override
	public void start(){
		System.out.println("jet starts");
	}
	@Override
	public void fly(){
		System.out.println("Jet fly");
	}
	@Override
	public void land(){
		System.out.println("jet lands");
	}
	@Override
	public void stop(){
		System.out.println("Jet stops");
	}
	public void doSomething(){
		System.out.println("jet is doing something");
	}

}