class TernaryOp{
	public static void main(String[] args) {
		int x=10,y=30,z=100;
		int max = x > y ? (x > z ? x : z ): (y > z ? y : z) ;
		System.out.println("max is : "+max);	
	}
}