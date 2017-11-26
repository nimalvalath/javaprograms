class Aeroplane extends Flyable {
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
	

	public void aeroPlaneSomething(){
		System.out.println("Aeroplane is doing something");
	}
}