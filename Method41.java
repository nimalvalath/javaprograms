/*
A method accepts a number as input and returns a string filled with natural numbers as many as the input
*/
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

class RandomNumberExamples{
	public static void main(String[] args) {
	System.out.println("method 1");	
	//ThreadLocalRandom.current().nextInt(min, max + 1);	
	for(int i=0;i<15;i++)	{
	
	int randomNum = ThreadLocalRandom.current().nextInt(0, 9 + 1);
	System.out.println(randomNum);	
	}

	System.out.println("method 2");

	for(int i=0;i<15;i++){
		int randResult=randInt(0, 9);
		System.out.println(randResult);
	}

	

	}

	public static int randInt(int min, int max) {

    
    Random rand= new Random();

    // nextInt is normally exclusive of the top value,
    // so add 1 to make it inclusive
    int randomNum = rand.nextInt((max - min) + 1) + min;

    return randomNum;
}
}