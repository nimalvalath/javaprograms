/*
Program:
WAP MakeDecimal : Given 3 digits a,b and c as input, return a double of the form a.bc

*/
import java.util.Scanner;
class DecimalCreator{
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);	
	System.out.println("Given 3 digits a,b and c as input, return a double of the form a.bc");
	System.out.println("Enter a-->");
	int  a=sc.nextInt();
	System.out.println("Enter b-->");
	int  b=sc.nextInt();
	System.out.println("Enter c-->");
	int  c=sc.nextInt();
	System.out.println("the decimal form a.bc --> "+decimalCreator(a,b,c));

	}

	public static double decimalCreator(int a,int b,int c){
		int lengthOfB=Calculate2.numberOfDigits(b);
		int lengthOfC=Calculate2.numberOfDigits(c);
		int cobinedNumber=((a*Calculate2.tenthPower((double)lengthOfB)+b)*Calculate2.tenthPower((double)lengthOfC)+c);
			
		return (double)cobinedNumber/(Calculate2.tenthPower((double)(lengthOfB+lengthOfC)));
	}



	

}