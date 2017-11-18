import java.util.Scanner;
import java.util.Random;
class MultiplicationArray{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("first 2D array");
		System.out.println("_______________");
       System.out.print("Enter number of rows: ");
       int r1 = s.nextInt();
       System.out.print("Enter number of columns: ");
       int c1 = s.nextInt();
       System.out.println("second 2D array");
		System.out.println("_______________");
        System.out.print("Enter number of rows: ");
       int r2 = s.nextInt();
       System.out.print("Enter number of columns: ");
       int c2 = s.nextInt();
       //arr1==r1 x c1
       int[][] arr1 = new int[r1][c1];
       System.out.println("arra1 created with"+r1+"x"+c1);
       //arr2== r2 x c2
       // for multiplication to happen c1==r2
       int[][] arr2 = new int[r2][c2];
       System.out.println("arra2 created with"+r2+"x"+c2);

       arr1= fillArray(arr1,r1,c1);
       arr2= fillArray(arr2,r2,c2);
       System.out.println();
       System.out.println("arr1");
       displayTwoDimArray(arr1,r1,c1);
       System.out.println();
       System.out.println("arr2");
       displayTwoDimArray(arr2,r2,c2);
       System.out.println();
       System.out.println("multiplication");
       //result r1 x c2 matrix
      	int[][] multiple= new int[r1][c2];
        System.out.println();
        if(c1==r2){
        	multiple= multiplicationOfTwoDim(arr1,arr2,r1,c1,c2);
	    	displayTwoDimArray(multiple,r1,c2);	
        }
        else{
        	System.out.println("multiplication not possible since column"+c1+"of first array not equals"+r2+" Row of second array");
        }
	    
	}

	public static int[][] multiplicationOfTwoDim(int[][] arr1,int[][] arr2, int r1,int c1,int c2){
		int[][] temp=new int[r1][c2];
		for (int i = 0; i < r1; i++) {
           for (int j = 0; j < c2; j++) {
           		for(int k=0;k< c1;k++){
           			temp[i][j] += arr1[i][k] * arr2[k][i];	
           		}
               
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