import java.util.Random;
import java.util.Scanner;

class TwoDimArrayRandom{

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