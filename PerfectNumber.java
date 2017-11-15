/*
PerfectNumber: A perfect number is a positive integer that is equal to the sum of its factors. 
For example, 6 is a perfect number because 6=1+2+3; but 24 is not perfect because 24<1+2+3+4+6+8+12.
 Given a number n, 
the objective is find out whether it is a perfect number or not.
*/
import java.util.Scanner;
class PerfectNumber{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int number=sc.nextInt();
	System.out.println(number+" is a PerfectNumber "+isPerfectNumber(number));
	
}

public static boolean isPerfectNumber(int n){
	int sum=0;
	for(int i=1 ;i <=n/2;i++){
		//System.out.println(i);
		if( n%i== 0){
			System.out.println("value of i"+i);
			sum+=i;
			System.out.println(sum);
		}
	}
	if (sum==n)
		return true;
	return false;
}

}