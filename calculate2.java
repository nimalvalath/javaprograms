class Calculate2{
	public static int numberOfDigits(int number){
		int count=0;
		while(number>0){
			number=number/10;
			count++;

		}
		return count;
	}
	public static int tenthPower(double raisedToValue){
		double tenthValue=10;
		int powerValue=(int)Math.pow(tenthValue,raisedToValue);
		return powerValue;

	}
}