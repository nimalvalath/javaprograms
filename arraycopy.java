class ArrayCopy{
	public static void main(String[] args) {
		char[] copyfrom={'a','b','c','d','e','f','g','h','i','j','k'};
		char[] copyTo= new char[7];
		System.arraycopy(copyfrom,2,copyTo,0,7);
		//syntax arraycopy(src[],from position,dest[],to dest_startPosition,length to be copied)
		System.out.println(new String(copyTo));	
		
	}

}