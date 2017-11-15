import java.util.Scanner;
/*
Write a method to generate even numbers between from and to
 ( you should not write the logic to check if number is even or not,
  instead you should call isEven() method which you create earlier)

*/

class EvenNnumGeneration{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("enter from range-->");
	int from=sc.nextInt();	
	System.out.println("enter to range-->");
	int to=sc.nextInt();
	EvenNumber.isEven(to,from);
	}
}