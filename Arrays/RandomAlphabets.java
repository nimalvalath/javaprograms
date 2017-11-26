
import java.util.concurrent.ThreadLocalRandom;

class RandomAlphabets{
	public static char arrayFilledUp(int min,int max){
	return (char)(ThreadLocalRandom.current().nextInt(min, max + 1));
	}
public static void main(String[] args) {
	char[] arrayRandomChar=new char[20];

	for (int i=0;i<20 ;i++) {
		arrayRandomChar[i]= arrayFilledUp(65,90);
	}
	displayArrayRandom(arrayRandomChar	);
}
public static void  displayArrayRandom(char[] arrayDisplay){
		System.out.println("Array filled with Random Alphabets");
		System.out.println("__________________________________");
		for(int i=0;i<arrayDisplay.length;i++){
		System.out.println("array value-->"+arrayDisplay[i]);
	}

}

}