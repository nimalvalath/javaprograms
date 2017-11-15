public class Car{
	double weight,height,speed;
	String color;

	//default constructor- compiler provided

	public void start(){
		System.out.println("Car started");
	} 
	public void move(){
		speed++;
		System.out.println("Car is in motion with speed:"+speed);
	}
	public void stop(){
		System.out.println("Car is stopped");

	}
}