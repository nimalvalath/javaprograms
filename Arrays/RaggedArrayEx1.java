import java.util.Scanner;
class RaggedArrayEx1{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		
		/*
		wrong way to deal with Ragged Arrays

		int[] aRaggedArray= new int[size];---not a ragged array defnition
		aRaggedArray[0][0]=1; --- cannot initialize for the above ragged array
		
		*/

		//proper way
		int[][] aRaggedArray= new int[size][];

		//aRaggedArray[0][0]=4;---if you try this -->null pointer exception
		//proper way

		aRaggedArray[0]= new int[4];//ragged array at position 0 of size 4 [0-3]
		/*
		aRaggedArray[1]= new int[3]
		aRaggedArray[2]= new int[1]
		aRaggedArray[3]= new int[1]
		or
		int[][] arr={
			{1,2,3},
			{1,2,3,4,5},
			{1,5,3,2,5,6}	
		};
		*/		

		aRaggedArray[0][0]=1;

		System.out.println(aRaggedArray[0][0]);//1
		System.out.println(aRaggedArray[0][1]);//0
		System.out.println(aRaggedArray[0][2]);//0
		System.out.println(aRaggedArray[0][3]);//0

		// end of example

		//System.out.println(aRaggedArray[0][4]);-- array out of bounds	
		//aRaggedArray[1][0]=4;---not defined -- null pointer exception
	}
}