class CarTest{
	public static void main(String[] args) {
		//orphan object
		new Car();
		//variable reference to class Car-object declaration
		Car ford;

		//instatiation 
		ford= new Car();
		//states get default values of primitive types or
		ford.height= 10;
		ford.color= "Red";

		System.out.println(ford.height);
		System.out.println(ford.speed);
		System.out.println(ford.weight);
		System.out.println(ford.color);

		System.out.println("______________________");

		Car audi= new Car();
		audi.height= 100;
		audi.weight= 200;
		audi.color= "Blue";

		System.out.println(audi.height);
		System.out.println(audi.weight);
		System.out.println(audi.color); 
		System.out.println(audi.speed);

		System.out.println("______________________");
		ford.start();
		audi.start();



	}
}