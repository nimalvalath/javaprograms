/*
	 Program
	WAP using methods to calculate factorial,check even or odd status, given value?

	*/
import java.util.Scanner;
class Method3{
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("factorial");
		System.out.println("enter value--> ");
		int value=sc.nextInt();
		System.out.println("factorail of "+value+"--> "+factorial(value));
		System.out.println();
		System.out.println("Prime or not");
		System.out.println("enter integer value--> ");
		int value2=sc.nextInt();
		boolean checkprime=false;
		checkprime=checkPrime(value2);
		if (checkprime) {
		System.out.println("The number"+value2+" is even");	
		}
		else{
			System.out.println("The number"+value2+" is odd");
		}
			
	}
	public static boolean checkPrime(int number){
		if(number%2==0)
			return true;
		return false;
	}

	public static int factorial(int number){
		if (number==0){
			return 1;
		}
		int result=1;
		while (number>0) {
			result*=number;
			number--;
		}
		return result;
	}

}