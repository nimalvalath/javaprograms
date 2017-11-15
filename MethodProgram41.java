/*
A method accepts a number as input and returns a string filled with natural numbers as many as the input
*/
 import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

class StringFiller{
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("string filler");
	System.out.println("enter length of string");
	int length=sc.nextInt();
	int min=0;
	int max=9;
	String newString= stringFilledUp(min,max,length);
	System.out.println("the new string "+newString);
}
public static String stringFilledUp(int min,int max,int length){
	String temp="";
	for(int i=0;i<length;i++){
		temp+=ThreadLocalRandom.current().nextInt(min, max + 1);
	}
	return temp;
}

}