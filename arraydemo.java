class Arraydemo{
	public static void main(String[] args) {
		int a[]=new int[5];
		int[] b=new int[5];
		int []c=new int[6];

		
		System.out.println(a.length);
		
		try{
			for (int j=0;j<b.length ;j++ ) {
			System.out.println(b[j]);
			}

		}	
		finally{
			System.out.println("finally called here ");
		}

		try{a[5]=30/0;
			for(int i=0;i<=5;i++)
		System.out.println(a[i]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("out of bound exception occured");
		}
		catch(ArithmeticException e){
			System.out.println("arithmetic exception occured");
		}

		

	}
}