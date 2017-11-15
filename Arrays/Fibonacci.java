class Fibonacci{
	public static void main(String[] args) {
		int[] arrayFib= new int[10];
		arrayFib[0]=0;
		arrayFib[1]=1;
		arrayFib=fibonacciGen(arrayFib);
		displayArrayFib(arrayFib);
	}
	public static void  displayArrayFib(int[] arrayDisplay){
		System.out.println("Array filled ");
		System.out.println("__________________________________");
		for(int i=0;i<arrayDisplay.length;i++){
		System.out.println("array value-->"+arrayDisplay[i]);
		}
	}
	public static int[] fibonacciGen(int[] arrayFib){
		 int n1=0,n2=1,n3,i;  
		for(i=2;i<arrayFib.length;++i)//loop starts from 2 because 0 and 1 are already printed    
 		{    
  			n3=n1+n2;    
    		n1=n2;
    		arrayFib[i]=n3;    
  			n2=n3;    
 		}    
 		return arrayFib;

	}
}