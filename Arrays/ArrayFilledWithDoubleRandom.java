import java.util.concurrent.ThreadLocalRandom;
class ArrayFilledWithDoubleRandom{

	public static double arrayFilledUp(int min,int max){
	return ThreadLocalRandom.current().nextDouble(min, max + 1);
	}

public static void main(String[] args) {
	double[] arrayRandomNum=new double[20];

	for (int i=0;i<20 ;i++) {
		arrayRandomNum[i]= arrayFilledUp(0,20);
	}
	displayArrayRandom(arrayRandomNum);
}
public static void  displayArrayRandom(double[] arrayDisplay){
		System.out.println("Array filled with Double Random numbers");
		System.out.println("________________________________________");
		for(int i=0;i<arrayDisplay.length;i++){
		System.out.println("array value-->"+arrayDisplay[i]);
	}

}
}