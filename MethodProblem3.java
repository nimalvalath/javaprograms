import java.util.Scanner;
/*
SameLastDigit : Given 2 non negative numbers a and b, return true if both of them have the same last digit.
AddForThird : Given three numbers a, b and c, return true if the sum of any two equals the third number.
*/
class MethodProblem3{
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		//samelastnumber
		System.out.println("Enter positive integer number1-->");
		int num1=sc.nextInt();
		System.out.println("Enter positive integer number2-->");
		int num2=sc.nextInt();
		System.out.println("is the last digits same--> 	"+checkSameLastDigits(num1,num2));
		System.out.println("Enter positive integer number3-->");
		int num3=sc.nextInt();
		System.out.println("is any of the third is some of other two-->"+isAddForThird(num1,num2,num3));

	}
	//SameLastDigit
	public static boolean checkSameLastDigits(int n1,int n2){
		int i=n1%10;
		int j=n2%10;
		if (i==j)
			return true;
		return false;
	}
	//Add for Third
	public static boolean isAddForThird(int n1,int n2,int n3){
		if(n1==n2+n3)
			return true;
		else if(n2==n1+n3)
			return true;
		else if (n3==n1+n2)
			return true;
		return false;
	}
}