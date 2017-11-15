import java.util.Scanner;
class IsDigit{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Find character is between 0-9");
		System.out.println("Enter any single character: ");
		//Two ways in java for reading character
		//for single character detection.
		//method1-----------------------------------------------------------------
		char character=sc.next().charAt(0);
		System.out.println("the character is a digit [0-9]-->"+isDigit(character));
		//method2-----------------------------------------------------------------
		/*try
		{
		char character=(char)System.in.read();
		System.out.println(character);
		}
		catch(Exception e){
			System.out.println(e);
		}*/
	}
	//for single character [0-9]
	public static boolean isDigit(char c){
		int x=(int)c;
		if (x>=48 && x<=57)
			return true;
		return false;
	}
}