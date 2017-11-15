/*
Create new classes for each real-world object that you observed at the beginning of this trail. 
Refer to the Bicycle class if you forget the required syntax.
For each new class that you've created above, create an interface that defines its behavior, 
then require your class to implement it.
Omit one or two methods and try compiling. What does the error look like?
*/
class Ex001 implements Bicycle{
	static final int MAX_GEAR=6;
	int cadence=0;
	int speed=0;
	int gear=1;
	@Override

	public void changeCadence(int newValue){
		cadence=newValue;
	}
	@Override
	public void changeGear(int newValue){
		if(newValue<MAX_GEAR)
		gear=newValue;
	}
	@Override
	public void speedUp(int increament){
		speed+=increament;
	}
	@Override
	public void applyBreaks(int decrement){
		speed-=decrement;
	}
	
	void printStates(){
		System.out.println("cadence-->"+cadence+" speed-->"+speed+" gear-->"+gear);
	}
	public static void main(String[] args) {
		 // Create two different 
        // Bicycle objects
        Ex001 bike1 = new Ex001();
        Ex001 bike2 = new Ex001();

        // Invoke methods on 
        // those objects
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();
		
	}
	
	



}