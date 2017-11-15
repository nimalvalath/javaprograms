	/*
	 Program
	WAP using methods to calculate speed given time and distance?

	*/
	import java.util.Scanner;
	class Method2{

		public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);	
		System.out.println("enter radius in cms--> ");
		float radius=sc.nextFloat();
		System.out.println("The value rounded radius--> "+roundOff(areaOfCircle(radius))+" cm"+superscript("2"));
		
		}
		public static double areaOfCircle(float radius){
		
			double area=Math.PI*radius*radius;
			return area;
		
		}
		public static double roundOff(double value){
		
			//Math.round(value*100)--> rounds the double to integer
			double rounded=(double)Math.round(value*100)/100;// dividing interger by 100 returns float there fore type cast 
			return rounded;
		
		}
		public static String superscript(String str) {
 	   		//to create superscript
 	   		str = str.replaceAll("0", "⁰");
    		str = str.replaceAll("1", "¹");
    		str = str.replaceAll("2", "²");
    		str = str.replaceAll("3", "³");
    		str = str.replaceAll("4", "⁴");
    		str = str.replaceAll("5", "⁵");
    		str = str.replaceAll("6", "⁶");
    		str = str.replaceAll("7", "⁷");
    		str = str.replaceAll("8", "⁸");
    		str = str.replaceAll("9", "⁹");         
    	return str;
		
		}
	}