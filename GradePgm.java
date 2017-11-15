class GradePgm{
	public static void main(String[] args) {
		int score=60;
		char grade='X';
		if( score>=75)
			grade = 'A';
		else if(score>=60)
			grade = 'B';
		else if(score>=50)
			grade='C';
		else if (score>=35)
			grade='D';
		else
			grade='F';

		switch(grade){
			case 'A':System.out.println("Distinction");
			break;
			case 'B':System.out.println("First class");
			break;
			case 'C':System.out.println("second class");
			break;
			case 'D':System.out.println("Third class");
			break;
			default:System.out.println("fail");
		}


	}
}