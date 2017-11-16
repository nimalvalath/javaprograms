import java.util.Scanner;
class PalindromeArray{

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		int[] array= new int[size];
		
		for(int i=0;i<array.length;i++){
			System.out.println("enter any digit[0-9]");
			array[i]=sc.nextInt();
		}
		//checking
		//System.out.println("length"+array.length);
		//if(array.length%2 == 0) mad idea
			System.out.println("Array contains palindrome of numbers-->"+checkEvenArrayPalindrome(array));
			

		
	}
	public static boolean checkEvenArrayPalindrome(int[] array){
		int j=array.length-1;
		int count=0;
		for(int i=0;i<array.length/2;i++,j--){
			//checking
			//System.out.println(array[i]);

			if(array[i]==array[j]){
				count++;
				//checking
				//System.out.println(count);
			}

		}
		if(count==array.length/2)
			return true;

		else
			return false;
	}

}