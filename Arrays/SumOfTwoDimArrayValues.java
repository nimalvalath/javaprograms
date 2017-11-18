import java.util.Random;
import java.util.Scanner;

class SumOfTwoDimArrayValues{

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter raw size ");
		int row=sc.nextInt();
		System.out.println("Enter column size");
		int column=sc.nextInt();
		int[][] twoDim=new int[row][column];

		twoDim= fillArray(twoDim,row,column); 
		System.out.println();
		System.out.println("2 D array--> of Random numbers");
		System.out.println(""+row+"x"+column);
		System.out.println();
		displayTwoDimArray(twoDim,row,column);
		System.out.println();
		System.out.println("sum of array elements");
		int sum=sumOfTwoDimArrayValues(twoDim,row,column);
		System.out.println("Total sum_values of elements-->"+ sum);
		
	}
	public static int sumOfTwoDimArrayValues(int[][] twoDim,int row,int column){
		int sum=0;
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				sum+=twoDim[i][j];
			}
		}
		return sum;

	}
	public static int[][] fillArray(int[][] twoDim,int row,int column){

		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				twoDim[i][j]=randomNumberGenerator(1,50);
			}
		}
		return twoDim;

	}

	public static void displayTwoDimArray(int[][] twoDim,int row,int column){

		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				System.out.print(twoDim[i][j]+" ");
			}
			System.out.println();
		}

	}

	public static int randomNumberGenerator(int min,int max){
	
		Random random= new Random();
		return random.nextInt((max-min)+1)+ min;
	
	}



}