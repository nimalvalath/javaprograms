class CharDemo{
	public static void main(String[] args) {
		char x,y;
		x=88;  // numeric value for X in unicode
		char xyz=1000;
		y='Y';
		System.out.println(x+" "+y);
		System.out.println("printing unknown "+xyz);
		for (int i=1;i<=50;i++){
			System.out.println(i+xyz);//here type conversion take place
		}

		for (int i=1000;i<=1050;i++){
		xyz++;// this will increment charecters by 1
		System.out.println("symbol:"+xyz+ "  correspondingnumeric value : "+i);// this will print characters one by one

		}

		System.out.println("two \n lines");

		

	}
}