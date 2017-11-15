import java.util.Scanner;
class PrimeNumbers{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter size of array ");
		int size=sc.nextInt();
		int[] arrayPrime= new int[size];
		arrayPrime=genPrime(size);
		displayArrayPrime(arrayPrime);

	}
	public static void  displayArrayPrime(int[] arrayDisplay){
		System.out.println("Array filled with Prime numbers");
		System.out.println("__________________________________");
		for(int i=0;i<arrayDisplay.length;i++){
		System.out.println("array value-->"+arrayDisplay[i]);
		}
	}
	public static int[] genPrime(int size){

		int[] arrayPrime=new int[size];
		int num=2;
		for(int j=0;j<size;num++){

			if(isPrime(num)){
				arrayPrime[j]=num;
				j++;
			}
						
			
		}
		return arrayPrime;
	}	
	public static boolean isPrime(int num){


		for(int i=2;i<num;i++){

			if(num%i==0){

				return false;

			}
			
		}
		return true;
			
		}
}