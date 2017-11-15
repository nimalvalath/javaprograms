
import java.util.*	;

class SortArray1{

	static Scanner scanAny=new Scanner(System.in);
	public static void main(String[] args) {
		int [] arrayNumber= new int[10];
		System.out.println(arrayNumber[0]);

		try{//sacnForInput(arrayNumber);
			for(int i=0;i<arrayNumber.length;i++){
			System.out.println("enter the element at position : "+i );
			arrayNumber[i]=scanAny.nextInt();	
			}		
			printNumberArray(arrayNumber);
			String [] arrayString=new String[10];
			for(int j=0;j<arrayString.length;j++){
			System.out.println("enter the element at position : "+j );
			arrayString[j]=scanAny.next();	
			}		

			//bubbleSort(arrayNumber);
			//insertionSort(arrayNumber);	
			mergeSort(arrayNumber,0,arrayNumber.length-1);
			printNumberArray(arrayNumber);
			callPgmEnd();
		}
		catch(InputMismatchException e){
			System.out.println("input mimsmatch");
		}
	}

	public static void bubbleSort(int[] arrayNumber){
		
			
				
				for(int k=0;k<arrayNumber.length;k++){
					for(int j=k+1;j<arrayNumber.length;j++){
						if(arrayNumber[k]>arrayNumber[j]){
							System.out.println("value of k"+k);
							int temp=arrayNumber[j];
							arrayNumber[j]=arrayNumber[k];
							arrayNumber[k]=temp	;	
						}										
					}				
				}
			printNumberArray(arrayNumber);
	}

	public static void insertionSort(int[] arrayNumber){
		for (int i=1;i<arrayNumber.length ;i++ ) {
			int key=arrayNumber[i];
			for(int j=i-1;j>=0;j--){
					if(arrayNumber[j]>key){
						
						arrayNumber[i]=arrayNumber[j];
						arrayNumber[j]=key;
					}
			}

		}
		printNumberArray(arrayNumber);
	}
	public static void mergeSort(int[] arrayNumber,int first,int last){
		if(first<last){
			int mid= (first + last)/2;
		mergeSort(arrayNumber,first,mid);
		mergeSort(arrayNumber,mid+1,last);
		merge(arrayNumber,first,mid,last);
		}
		

		
	}
	public static void merge(int[] arrayNumber, int first,int mid,int last ){

		int n1 = mid - first +1;
		int n2 = last - mid;

		int li[] = new int[n1];
		int  ri[]= new int[n2];

		for(int i=0; i< n1; ++i)
			li[i]=arrayNumber[first + i];
		for(int j=0; j< n2; ++j)
			ri[j]=arrayNumber[mid + 1 + j];

		int i=0,j=0;
		int k=first;
		while(i<n1 && j<n2){
			if(li[i]<=ri[j]){
				arrayNumber[k]=li[i];
				i++;
			}
			else{
				arrayNumber[k]=ri[j];
				j++;
			}
			k++;
		}

		while(i<n1){
			arrayNumber[k]=li[i];
			i++;
			k++;

		}
		while(j<n2){
			arrayNumber[k]=ri[j];
			j++;
			k++;
		}
	}
	public static void callPgmEnd(){
		System.out.println("pgm ends here");
	
	}
	public static void printNumberArray(int[] arrayNumber){
		for(int i=0;i<arrayNumber.length;i++){
			System.out.println("the ARRAY ELEMENTS by position :"+i+" is "+  arrayNumber[i]);
		}
	}
}