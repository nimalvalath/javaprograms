class Pattern{
	public static void main(String[] args) {
	hashPattern();
	numberPattern();
	}
	public static void hashPattern(){
		System.out.println("Hash Pattern");
		for(int i=0;i<6;i++){
			for(int j=1;j<=5;j++)
				System.out.print("#");
			System.out.println("");
		}
	}
		public static void numberPattern(){
			System.out.println("number pattern");
		for(int i=1;i<6;i++){
			for(int j=1;j<=5;j++)
				System.out.print(i*j+" ");
			System.out.println("");
		}
	}	
}