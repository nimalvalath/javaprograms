import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

class PalindromeInARange{
	public static void main(String[] args) {
		
		int[] arrayPalindrome;	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the maximum range");
		int rangeMax=sc.nextInt();
		System.out.println("Enter the minimum range");
		int rangeMin=sc.nextInt();
		
		arrayPalindrome= numberGeneration(rangeMin,rangeMax);
		
		displayArray(arrayPalindrome);		
	}

	public static void displayArray(int[] array){
		System.out.println("array elements");
		for(int i=0;i<array.length;i++){
			if(array[i]!=0)
			System.out.println(array[i]);
		}
	}

	public static boolean checkPalindrome(int num){
		int r,sum=0,temp;    
    
  		temp=num;    
  		while(num>0){    
   			r=num%10;  
   			sum=(sum*10)+r;    
   			num=num/10;    
  		}    
  		if(temp==sum)    
   			return true;    
  		else    
   			return false;    
 	}
	
	public static int[] numberGeneration(int to , int from){
		
		if(from<to){
			int size1=(int)((to-from)+1)/2;
			int[] arrayOddNumber1=new int [size1];
			for(int i=0;from<=to && i<size1;from++){
				if(checkPalindrome(from)&& from >10){
					arrayOddNumber1[i]=from;
					i++;
				}
			}
		return arrayOddNumber1;
		}
		else{
			int size2=(int)((from-to)+1)/2;
			int[] arrayOddNumber2=new int [size2];

			for(int j=0;from>=to && j<size2;from--){
				if(checkPalindrome(from) && from > 10){
					arrayOddNumber2[j]=from;
					j++;
				}
			}
		return arrayOddNumber2;
		}
	
	}
}