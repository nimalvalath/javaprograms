import java.util.concurrent.ThreadLocalRandom;
class ArrayFilledWithIntRandom{

	public static int arrayFilledUp(int min,int max){
	return ThreadLocalRandom.current().nextInt(min, max + 1);
	}

public static void main(String[] args) {
	int[] arrayRandomNum=new int[20];

	for (int i=0;i<20 ;i++) {
		arrayRandomNum[i]= arrayFilledUp(0,20);
	}
	displayArrayRandom(arrayRandomNum);
}
public static void  displayArrayRandom(int[] arrayDisplay){
		System.out.println("Array filled with Random numbers");
		System.out.println("__________________________________");
		for(int i=0;i<arrayDisplay.length;i++){
		System.out.println("array value-->"+arrayDisplay[i]);
	}

}
}