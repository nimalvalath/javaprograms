public class SummationOfNumbers{
	public static void main(String[] args) {
		int[] num=  {1,2,3,4,5,6,7,8,9};
		displayArray(num);
		System.out.println("________");
		System.out.println(sumOfArrayNumbers(num)+"<--total");
	}
	public static int sumOfArrayNumbers(int[] num){
		int sum=0;
		for(int i=0;i<num.length;i++){
			sum+=num[i];
		}
		return sum;
	}
	public static void displayArray(int[] array){
		System.out.println("array elements");
		for(int i=0;i<array.length;i++){
			
			System.out.println(array[i]);
		}
	}

}
