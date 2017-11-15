import java.util.Scanner;
/*
LotteryPrize: Jack bought a lottery ticket. He will get a reward based on the number of the lottery ticket. 
The rules are as follows –
 If the ticket number is divisible by 4, he gets 6 –
 If the ticket number is divisible by 7, he gets 10 – 
If the ticket number is divisible by both 4 and 7, he gets 20 Otherwise, he gets 0. 
Given the number of thelottery ticket as input, compute the reward he will receive.
*/
class LotteryPrize1{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your lottery number-->");
		int lotterynum=sc.nextInt();
		int prizeRec=checkForPrize(lotterynum);
		System.out.println("prize recieved-->"+prizeRec);
	}
	public static int checkForPrize(int l){
		if(l%4==0 && l%7==0)
			return 20;
		else if (l%7==0)
			return 10;
		else if (l%4==0)
			return 6;
		return 0;
	}
}