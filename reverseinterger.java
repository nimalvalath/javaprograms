import java.util.Scanner;

class ReverseInteger{
	


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a integer number :");
		int number=sc.nextInt();
		int length=findLength(number);
		System.out.println("the length of number is: "+length);
		int reverseNumber=reverseOfNumber(number,length);
		System.out.println("the reverse of given number: "+reverseNumber);


	}
	public static int findLength(int number){
		int length=0;
		while(number>0){
			number=number/10;
			length++;
		}
		return length;
	}
	public static int reverseOfNumber(int number,int length){
		int remainder=0;
		int reverseNumber=0;
		while(length>0){
			remainder=number%10;
			number=number/10;
			reverseNumber=reverseNumber*10+remainder;
			length--;
		}
		return reverseNumber;
	}

}