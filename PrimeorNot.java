import java.util.Scanner;
class PrimeOrNot{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number ");
		int num=sc.nextInt();
		boolean prime= isPrime(num);
		if(prime){
			System.out.println(num+"--> is prime");
		}
		else{
			System.out.println(num+"-->not prime");
		}
		
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