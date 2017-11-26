simport java.util.Scanner;
class RaggedArrayPgm{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		char[][] aRaggedArray= new char[size][];
		aRaggedArray= fillTriangleData(aRaggedArray,size);
		System.out.println("Triangle of Stars");
		System.out.println("__________________");
		System.out.println();
		displayRaggedArray(aRaggedArray, size);
		System.out.println();
		System.out.println("__________________");
		System.out.println("pgm end");		
	}
	public static char[][] fillTriangleData(char[][] aRagArray,int size){
		for(int i=0;i<size;i++){
			int temp=i+1;
			aRagArray[i]= new char[temp];
			for(int j=0;j<temp;j++){
				aRagArray[i][j]='*';
			}
		}
		return aRagArray;
	}
	public static void displayRaggedArray(char[][] raggedArray,int size){
		for(int i=0;i<size;i++){
			for(int j=0;j<raggedArray[i].length;j++){
				System.out.print(raggedArray[i][j]+" ");
			}
			System.out.println();
		}
	}
}