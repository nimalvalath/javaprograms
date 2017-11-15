/*
program to copy array to another
*/

class ex002{
	public static void main(String[] args) {

		char[] copyFrom= {'d','e','c','a','f','f','e','i','n','a','t','e','d'};//miss this compile error array not initialised
		//initilaise another
		char[] copyTo=new char[7];
		System.out.println("length of array copy from :"+copyFrom.length);
		//Array copy
		/*
		public static void arraycopy(Object src, int srcPos,
                             Object dest, int destPos, int length)

		*/
		System.arraycopy(copyFrom,2,copyTo,0,7);
		
		System.out.println(new String(copyTo));			}
}