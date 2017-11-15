import java.util.Scanner;
class WithoutIfStmnt{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.println("enter num--> ");
		int num=sc.nextInt();
		System.out.println("enter num1--> ");
		int num1=sc.nextInt();
		System.out.println("enter num2--> ");
		int num2=sc.nextInt();
		int largest=amoungLargestOne(num,num1,num2);
		System.out.println(largest);
		System.out.println("numbers are in AscendingOrder :"+ isAscendingOrder(num,num1,num2));

		System.out.println("enter a 4 digit number");
		int num4=sc.nextInt();
		System.out.println("the sum of  4 digits-->"+addDigits(num4));
	}
	//LargerThanOne
	public static int amoungLargestOne(int a , int b, int c){
		return((a>b) && (a>c)? a : 0);

	}
	//NumberInAscendingOrder
	public static boolean isAscendingOrder(int a, int b, int c){
		return ((a<b)&& (b<c) && (a<c)? true : false);
	}
	//SumOf4Digits
	public static int addDigits(int number){
		int sum=0;
		for(int i=0;i<4;i++){
			int remainder=number%10;
			number=number/10;
			sum+=remainder;

		}
		return sum;
	}


}	