public class Aeroplane implements Flyable {
	

	@Override
	public void start(){
		System.out.println("Aeroplane starts");
	}
	@Override
	public void fly(){
		System.out.println("Aeroplane fly");
	}
	@Override
	public void land(){
		System.out.println("Aeroplane lands");
	}
	@Override
	public void stop(){
		System.out.println("Aeroplane stops");
	}

	public void aeroPlaneSomething(){
		System.out.println("Aeroplane is doing something");
	}

}