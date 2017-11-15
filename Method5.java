/*
Program:
WAP for fibonacci, divisible by six, time in seconds to hours, no of digits in a number
*/

import java.util.Scanner;
class Method5{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
	//Fibonacci
	System.out.println("fibonacci series");
	System.out.println("Enter the range from 0 to -->");
	int number=sc.nextInt();
	System.out.println(Calculate1.fibonacci(number));
	System.out.println();
	//Divisibility by six
	System.out.println("Divisible by six");	
	System.out.println("Enter the number--> ");
	int value2=sc.nextInt();
	System.out.println("the number "+value2+"divisible by six is--> "+ Calculate1.divisibleBySix(value2));
	//Time in sec to hrs
	System.out.println();
	System.out.println("time in SEC to HRS");
	System.out.println("Enter seconds-->");
	double timeValue=sc.nextInt();
	System.out.println("Time in HRS --> "+ Calculate1.timeSECToHRS(timeValue));
	//No of digits in number
	System.out.println("No of digits ");
	System.out.println("Enter a number--> ");
	int  number2=sc.nextInt();
	System.out.println("Number of digits--> "+ Calculate1.numberOfDigits(number2));

	}


}

