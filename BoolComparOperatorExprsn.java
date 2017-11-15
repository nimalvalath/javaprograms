class BoolComparOperatorExprsn{
	public static void main(String[] args) {
		boolean flag=false;
		boolean isSingle=true;
		//boolean test
		System.out.println("flag is set to: "+flag);
		System.out.println("are you single: "+isSingle);
		//comparison opr
		System.out.println(1<2);
		System.out.println(1<=2);
		System.out.println(1>2);
		System.out.println(2>=2);
		System.out.println(2!=2);
		System.out.println(1==2);
		//char comparison
		System.out.println("is a > A : "+('a'>'A'));
		System.out.println("is '1' >'0'"+('1'>'0'));
		//boolean operator or logical operator
		int year=2020;
		//checking leap year or not
		System.out.println((year%4==0 && year%100!=0)||(year%400==0));
	}
}