class ex001{
	public static void main(String[] args) {
		//declare array of type integer
		int[] anArray;
		//allocate memory for 10 integers
		anArray= new int[10];//miss this compile error array not initialised
		//initilaise first element
		anArray[0]= 100;
		//initilaise second element
		anArray[1]= 200;
		anArray[2]= 300;
		anArray[3]= 400;
		anArray[4]= 500;
		anArray[5]= 600;
		//uninitialised position get default value of type of array
		System.out.println("Element at index 0:"+anArray[0]);
		System.out.println("Element at index 1:"+anArray[1]);
		System.out.println("Element at index 2:"+anArray[2]);
		System.out.println("Element at index 3:"+anArray[3]);
		System.out.println("Element at index 4:"+anArray[4]);
		System.out.println("Element at index 5:"+anArray[5]);
		System.out.println("Element at index 6:"+anArray[6]);
		System.out.println("Element at index 7:"+anArray[7]);
		System.out.println("Element at index 8:"+anArray[8]);
		System.out.println("Element at index 9:"+anArray[9]);
		//Below stmnt: run time error 
		//no compile time error
		//array out of bounds exception
		//System.out.println(anArray[10]);	
		System.out.println("length of array :"+anArray.length);

	}
}