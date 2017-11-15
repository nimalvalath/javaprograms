class TrickLoop2{
	public static void main(String[] args) {
		int number=100;
		for (int i=5;i>0 ;i-- ) {
			number-=i;
			System.out.println(number);
		}
		/*
			number value = 100
			loop1 i=5 5>0 true
			number value 95
			i value 4
			loop1 i=4 4>0 true
			number value 91
			i value 3
			loop1 i=3 3>0 true
			number value 88
			i value 2
			loop1 i=2 2>0 true
			number value 86
			i value 1
			loop1 i=1 1>0 true
			number value 85
			i value 0
			loop1 i=0 0>0 false
			exit
		*/
	}
}