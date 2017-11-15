/*
Program:
WAP AndBooleans : Given three booleans as input, return the and of the all three booleans.


*/
import java.util.Scanner;
class AndBoolean{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("three booleans as input, return the and of the all three booleans");
		System.out.println("Enter boolean 3 boolean value");
		boolean a=sc.nextBoolean();
		boolean b=sc.nextBoolean();
		boolean c=sc.nextBoolean();
		System.out.println("Anding Boolean result is --> "+ (a && b && c));	
	}
}