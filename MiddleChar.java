import java.util.Scanner;
/*
MiddleChar : Given three chars as input, return the char that would come in
 the middle if the chars were arranged in order.
 Note that > operator can be used for chars.
*/
class MiddleChar{
	
	public static void main(String[] args) {
		initialisation();
		

	}
	public static void initialisation(){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any single character");
		System.out.println("character1-->");
		char char1=sc.next().charAt(0);
		System.out.println("character2-->");
		char char2=sc.next().charAt(0);
		System.out.println("character3-->");
		char char3=sc.next().charAt(0);
		comparisonMiddleChar(char1,char2,char3);
	}
	public static void comparisonMiddleChar(char char1,char char2,char char3){
		if(char1<char2 && char3>char2)
			System.out.println(char2 +" is the middle character");
		else if (char2>char1 && char3>char1)
			System.out.println(char1 +" is the middle character");
		else
			System.out.println(char3 +" is the middle character");
	}

}