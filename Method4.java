/*
	 Program
	WAP using methods to calculate plaindrome,check prime number status, given a value?

	*/
import java.util.Scanner;
class Method4{
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Check a number is palindrome");
		System.out.println("enter a integer value--> ");
		int value=sc.nextInt();
		System.out.println("The status of "+value+" is palindrome is "+palindrome(value));
		System.out.println();
		System.out.println("Prime or not");
		System.out.println("enter integer value--> ");
		int value2=sc.nextInt();
		boolean checkprime=false;
		checkprime=checkPrime(value2);
		if (checkprime) {
		System.out.println("The number"+value2+" is Prime");	
		}
		else{
			System.out.println("The number"+value2+" is composite");
		}
			
	}
	public static boolean checkPrime(int number){
		for(int i =2;i<number;i++){
			if(number%i==0)
				return false;
		
		}
		return true;
		
	}

	public static boolean palindrome(int number){
		
		int reverse=0,remainder=0,tempNumber=number;
		while(number>0){
			remainder=number%10;
			//System.out.println(remainder);
			number=number/10;
			//System.out.println(number);
			reverse=reverse*10+remainder;
			//System.out.println(reverse);
		}
		number=tempNumber;
		if(reverse==number){

			return true;
		}
		else{

			return false;
		}
				
	}

}