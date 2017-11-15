import java.util.Scanner;
class ChangeCharCase{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//get character input
		System.out.println("enter any character-->");
		
		char c=sc.next().charAt(0);
		
		//System.out.println(c);

		//System.out.println((int)c);
		 //65 to 90 A-Z
		 //97 to 122 a-z
		changeCharCase(c);

	}
	public static void changeCharCase(char c){
		int x=(int)c;
		if(x>=65 && x<=90)
			x+=32;
			
		else
			x-=32;
		System.out.println("change case to-->"+(char)x);		
	}
	
}