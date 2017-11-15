
class ArrayOfNaturalNums{

	static	int size=10;
	public static void main(String[] args) {

	fillNaturalNums(size);	
			
	}
	public static void fillNaturalNums(int size){
	int[] arrayNum= new int[size];

	System.out.println(arrayNum.length);
	for(int i=0;i<arrayNum.length;i++){
		arrayNum[i]=i;
	}
	displayArrayNaturalNums(arrayNum);
	}
	public static void  displayArrayNaturalNums(int[] arrayDisplay){
		System.out.println("Array filled with natural numbers");
		System.out.println("__________________________________");
		for(int i=0;i<arrayDisplay.length;i++){
		System.out.println("array value-->"+arrayDisplay[i]+" at index "+i);
	}
	}
}