import java.util.Scanner;
class EvenNumbers{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("enter from range-->");
	int from=sc.nextInt();	
	System.out.println("enter to range-->");
	int to=sc.nextInt();
	int[] arrayEvenNumbers= evenNumberGeneration(to,from);
	displayArrayEven(arrayEvenNumbers);

	}
	public static void  displayArrayEven(int[] arrayDisplay){
		System.out.println("Array filled with Even numbers");
		System.out.println("__________________________________");
		for(int i=0;i<arrayDisplay.length;i++){
		System.out.println("array value-->"+arrayDisplay[i]);
		}
	}

	public static int[] evenNumberGeneration(int to , int from){
		
		if(from<to){
			int size1=(int)((to-from)+1)/2;
		int[] arrayEvenNumber1=new int [size1];
		for(int i=0;from<=to && i<size1;from++){
			if(from%2==0 && from !=0){
				arrayEvenNumber1[i]=from;
				i++;
			}
		}
		return arrayEvenNumber1;
	}
	else{
		int size2=(int)((from-to)+1)/2;
		int[] arrayEvenNumber2=new int [size2];

		for(int j=0;from>=to && j<size2;from--){
			if(from%2==0 && from !=0){
				arrayEvenNumber2[j]=from;
				j++;
			}
		}
		return arrayEvenNumber2;
	}
	
	}
}