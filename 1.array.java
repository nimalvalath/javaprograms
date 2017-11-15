import java.util.Scanner;
class BubbleSort{
	static Scanner read= new Scanner(System.in);
	public static void main(String[] args) {
		int[] array;
		
		//we can define array for 
		//all primitive java data types
		//and for classes- class array
		//Myclass myClassArray[];
		//,Object class array
		//Object[] myObject[];
		//collection
		//Collection[] ca;


		//array definition
		array=new int [10];
		//array elements once defined are
		//automatically assigned to 0
		System.out.println(array.length);
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}


		array=new int[]{1,2,3,4,5,6,7,8};
		// we could redefine the array with a smaller 
		// list of values 

		System.out.println(array.length);
		for(int j=0;j<array.length;j++){
			System.out.println(array[j]);
		}
		System.out.println(array.length);
		// now consider this
		//suppose we are breaking at index 5

		int[] array2= new int[10];
		System.out.println(array2.length);		
		for (int k=0;k<array2.length ;k++ ) {
			System.out.println("give next element : ");
			array2[k]=read.nextInt();
			if (k==5) {
				break;
			}
		}
		System.out.println(array2.length);		
		for(int l=0;l<array2.length;l++){
			System.out.println(array2[l]);
		}
		//the value of indexes 6,7,8,9
		// will be default zeros
		{


		char[] array3= new char[10];
		System.out.println(array3.length);
		for(int i=0;i<array3.length;i++){
			System.out.println(array3[i]);
		}		
		System.out.println(array3.length);		
		for (int k=0;k<array3.length ;k++ ) {
			System.out.println("give next element : ");
			array3[k]=read.next().charAt(0);
			if (k==5) {
				break;
			}
		}
		System.out.println(array3.length);		
		for(int l=0;l<array2.length;l++){
			System.out.println(array3[l]);
		}
		//the value of indexes 6,7,8,9
		// will be default " "
		}


	}
}