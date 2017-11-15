import java.util.Scanner;
class OddNumbers{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("enter from range-->");
	int from=sc.nextInt();	
	System.out.println("enter to range-->");
	int to=sc.nextInt();
	int[] arrayOddNumbers= oddNumberGeneration(to,from);
	displayArrayOdd(arrayOddNumbers);

	}
	public static void  displayArrayOdd(int[] arrayDisplay){
		System.out.println("Array filled with Odd numbers");
		System.out.println("__________________________________");
		for(int i=0;i<arrayDisplay.length;i++){
		System.out.println("array value-->"+arrayDisplay[i]);
		}
	}

	public static int[] oddNumberGeneration(int to , int from){
		
		if(from<to){
			int size1=(int)((to-from)+1)/2;
		int[] arrayOddNumber1=new int [size1];
		for(int i=0;from<=to && i<size1;from++){
			if(from%2==1 && from !=0){
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
			if(from%2==1 && from !=0){
				arrayOddNumber2[j]=from;
				j++;
			}
		}
		return arrayOddNumber2;
	}
	
	}
}