/*
Program:
WAP to calcCalculate RequiredRunRate : A team is chasing the target set in a one day international match. 
The objective is to compute the required run rate. 
The following have provided as input: target, maxOvers, currentScore, oversBowled
*/
import java.util.Scanner;
class RunRatemethod6{
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Required runrate calculator one dat international");
		System.out.println("Following inputs required" );
		System.out.println("target-->");
		int target=sc.nextInt();

		int maxOvers=50;
		System.out.println("current Score--> ");
		int currentScore=sc.nextInt();
		System.out.println("overs Bowled-->");
		int oversBowled=sc.nextInt();

		System.out.println("Required runrate is more than-->"+RunrateCalculator.runRateCalculator(target,maxOvers ,oversBowled,currentScore));


	}
}