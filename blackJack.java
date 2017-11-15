/*
Blackjack : Given 2 intt values greater than 0, return 
whichever value is nearest to 21 without being greater than 21. 
Return -1 if the values are greater than 21.
 Also return -2 if both the values are same and less or equal to 21.
*/
import java.util.Scanner;

class BalckJack{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	System.out.println("enetr two nums greater than zero");
	System.out.println("enter num1");
	int num1=sc.nextInt();
	System.out.println("enter num2");
	int num2=sc.nextInt();
	int result=checkBlackJack(num1,num2);
	if(result==0)
		System.out.println("try again doesnt matter");
	else 
		System.out.println("the Blackjack result between "+num1+" and "+num2+" is "+result);
	}

	public static int checkBlackJack(int n1, int n2){
	if (n1>21 && n2 > 21)
		return -1;
	else if (n1==n2 && n1<21 && n2<21 || n1==21 || n2==21)
		return -2;
	else if(n1<21 && n2>21)
		return n1;
	else if(n2<21 && n1>21)
		return n2;
	else if(n1<21 && n2<21 )
		if(21-n1 < 21-n2)
			return n1;					
		else if (21-n1 > 21-n2)
			return n2;
	return 0;	
	}
}