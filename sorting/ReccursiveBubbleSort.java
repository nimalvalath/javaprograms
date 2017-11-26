import java.util.Arrays;
class ReccursiveBubbleSort{
	public static void main(String[] args) {
		int[] arr= {5,2,7,4,1,3,8,9,0};
		reccursiveBubbleSort(arr,arr.length);
		System.out.println("ordinary print");
		for (int i=0;i<arr.length ;i++ ) {
			System.out.println(arr[i]);
		}
		System.out.println("print using array class");
		System.out.println(Arrays.toString(arr));
	}
	public static void reccursiveBubbleSort(int[] arr,int n) {
		if (n==0) {
			return;
		}
		if(n==1){
			return;
		}
		for (int i=0;i<n-1;i++ ) {
			if (arr[i]>arr[i+1]) {
			 	int temp=arr[i];
			 	arr[i]= arr[i+1];
			 	arr[i+1]= temp;
			 } 
		}
		reccursiveBubbleSort(arr,n-1);
	}


}