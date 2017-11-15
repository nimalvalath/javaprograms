import java.util.Scanner;
class ProgramMethod{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number-->");
		int num=sc.nextInt();
		System.out.println("multiple of 3 or 7"+ multipleOfThreeOrSeven(num));
		System.out.println("enter three numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		System.out.println("Largest of 3 numbers is -->"+findLargest(num1,num2,num3));

	}
	//Multiple37
	public static boolean multipleOfThreeOrSeven(int num){
			if(num%3==0 || num%7==0)
				return true;
			return false;
	}
	//LargestOfThree
	public static int findLargest(int num1, int num2, int num3){
		int largest=0;
		if(num1>num2 && num1>num3)
		 	return num1;
		 else if(num2>num1 && num2>num3)
		  	return num2;
		 else
			return num3;
	}
	

}