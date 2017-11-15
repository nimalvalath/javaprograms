/*
LotteryPrize3 : Jack bought 3 lottery tickets. He will get a reward based on the number of the lottery ticket.
 The rules are as follows
  – If the ticket number is divisible by 4, he gets 6 
– If the ticket number is divisible by 7, he gets 10 – 
 If the ticket number is divisible by both 4 and 7, he gets 20 – Otherwise, he gets 0.
 Given the numbers of the 3 lottery tickets as input, compute the total reward he will receive. In this problem
 define a function to compute the reward given the ticket number and use that function to calculate the total reward.
*/ 
import java.util.Scanner;
class LotteryPrize2{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no:of lottery tickets-->");
		int lotteryTickets=sc.nextInt();
		int totalPrice=0;

		while(lotteryTickets>0){
			System.out.println("Enter lottery Ticket number-->");
			int lotterynum=sc.nextInt();
			totalPrice+=checkForPrize(lotterynum);
			lotteryTickets--;
		}
		System.out.println("Total prize money-->"+totalPrice);
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