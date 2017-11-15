import java.util.Scanner;
class UnicodeWithinRange{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter from unicode equivalent integer:");	
	int from=sc.nextInt();
	System.out.println("Enter to unicode equivalent integer:");
	int to =sc.nextInt();
	int count=from;
	if(from>to){

		System.out.println("character equivalents");
		while(count>=to){
			System.out.print(((char)count--)+" ");

		}
	}
	else{

		System.out.println("character equivalents");
		while(count<=to){
			System.out.print(((char)count++)+" ");

		}
	}
	System.out.println(" ");
	}

}