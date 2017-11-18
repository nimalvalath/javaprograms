import java.util.Scanner;
import java.util.Random;
class AdditionOfTwoDim{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
       System.out.print("Enter number of rows: ");
       int rows = s.nextInt();
       System.out.print("Enter number of columns: ");
       int columns = s.nextInt();
       int[][] arr1 = new int[rows][columns];
       int[][] arr2 = new int[rows][columns];

       arr1= fillArray(arr1,rows,columns);
       arr2= fillArray(arr2,rows,columns);
       System.out.println();
       System.out.println("arr1");
       displayTwoDimArray(arr1,rows,columns);
       System.out.println();
       System.out.println("arr2");
       displayTwoDimArray(arr2,rows,columns);
       System.out.println();
       System.out.println("sum");
       int[][] sum= new int[rows][columns];
       sum=sumOfTwoDim(arr1,arr2,rows,columns);
       System.out.println();
       displayTwoDimArray(sum,rows,columns);

	}

	public static int[][] sumOfTwoDim(int[][] arr1,int[][] arr2, int row,int column){
		int[][] temp=new int[row][column];
		for (int i = 0; i < row; i++) {
           for (int j = 0; j < column; j++) {
               temp[i][j] = arr1[i][j] + arr2[i][j];
           }

       }
       return temp;
	}
	public static void displayTwoDimArray(int[][] twoDim,int row,int column){

		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				System.out.print(twoDim[i][j]+" ");
			}
			System.out.println();
		}

	}

	public static int[][] fillArray(int[][] twoDim,int row,int column){

		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				twoDim[i][j]=randomNumberGenerator(1,50);
			}
		}
		return twoDim;

	}
	public static int randomNumberGenerator(int min,int max){
	
		Random random= new Random();
		return random.nextInt((max-min)+1)+ min;
	
	}


}