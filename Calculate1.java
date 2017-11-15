class Calculate1{

	public static String fibonacci(int number){
		int a=0,b=1,temp=0;
		String fibonacci="0 ";
		while(b<=number	){
			temp=a;
			a=b;
			b=temp+b;
			
			fibonacci=fibonacci+a+" ";
			
		}
		return (fibonacci+" end") ;
	}
	public static boolean divisibleBySix(int number){
		if(number%6==0)
			return true;
		return false;
	}
	public static double timeSECToHRS(double number){
		double hours=number/3600;
			return hours;		
	}
	public static int numberOfDigits(int number){
		int count=0;
		while(number>0){
			number=number/10;
			count++;

		}
		return count;
	}
	
}