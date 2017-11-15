	/*
	 Program
	WAP using methods to calculate speed given time and distance?

	*/
	import java.util.Scanner;
	class Method1{


		public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);	
		System.out.println("enter time in hrs--> ");
		float time=sc.nextFloat();
		System.out.println("enter distance in kms--> ");
		float distance=sc.nextFloat();
		System.out.println("The value rounded speed--> "+roundOff(speedOf(time,distance))+" km/hr");

		

		}
		public static double speedOf(float time,float distance){
			double speed=distance/time;
			return speed;
		}
		public static double roundOff(double value){
			//Math.round(value*100)--> rounds the double to integer
			double rounded=(double)Math.round(value*100)/100;// dividing interger by 100 returns float there fore type cast 
			return rounded;
		}
	}