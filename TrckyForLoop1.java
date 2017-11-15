class TrickyForLoop1{
	public static void main(String[] args) {
		for(int i=0;i<10;i++){

			System.out.println("i : "+i);	
		}
		//	System.out.println(i);
		//out of scope
		System.out.println(" ");
		int i;
		for (i=0;i<10 ;i++ ) {
			System.out.println("i : "+i);
		}
		System.out.println(i);
		int j;
		for(j=0;j++<10;j++){
			System.out.println("numbers are -->"+j);
		}
		/*
			working -initail j value=0
			loop1:-j++ ,j value =1<10
			print 1
			j++ , j value =2
			loop2:j++, j value =3<10
			print 3
			j++, j value =4
			loop3:j++, j value =5<10
			print 5
			j++, j value =6
			loop4:j++, j value =7<10
			print 7
			j++, j value =8
			loop3:j++, j value =9<10
			print 9
			j++, j value =10
			LOOP EXITS

		*/		
	}

}