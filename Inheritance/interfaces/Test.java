
class Test {
	public static void main(String[] args) {
		Aeroplane apln= new Aeroplane();
		Jet jet= new Jet();
		
		

		apln.start();
		System.out.println(apln.a);
		System.out.println("MAX speed of plane-->"+apln.MAX_SPEED);

		apln.fly();
	    apln.aeroPlaneSomething();	
	    apln.land();
	    apln.stop();
	    
	    jet.start();
	    System.out.println(jet.a);
	    System.out.println("Max speed of jet-->"+jet.MAX_SPEED);
	    jet.fly();
	    jet.land();
	    jet.doSomething();
	    jet.stop();

	}
	
}