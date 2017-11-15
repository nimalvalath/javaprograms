class RunrateCalculator{

	public static double runRateCalculator(int target,int maxOver ,int overBowled,int currentScore ){
		double required_runrate= (target-currentScore)/(maxOver-overBowled);
		return required_runrate;
	}

}