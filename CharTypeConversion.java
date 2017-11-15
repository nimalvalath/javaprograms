class CharTypeConversion{
	public static void main(String[] args) {
		 
		 char unicode='\u0D05';// unicode for Malayalam charachter a
		 char ch='a';
		 int unicodeA='A';
		 int unicodeMalayalamA='\u0D05';
		 System.out.println(unicodeMalayalamA);
		 System.out.println(unicodeA);
		 System.out.println(ch);
		System.out.println(unicode);
		byte b='x';//x donot require casting because value of x is in the range
		System.out.println(b);
		//integer to char
		char var1= (char) 123;
		System.out.println(var1);
		char var2= (char) 97.10;
		System.out.println(var2);
		int var2int=var2;
		System.out.println(var2int);
		System.out.println((char)60);


	}
}