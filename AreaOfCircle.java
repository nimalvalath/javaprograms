import java.util.Scanner;
class AreaOfCircle{
	static Scanner reader=new Scanner(System.in);
	//donot forget semi colon
	static double PI=3.14;
	public static void main(String[] args) {

		System.out.println("Enter radius of circle: ");
		double radius=reader.nextDouble();
		System.out.println("The AreaOfCircle is: "+(PI*radius*radius));

	}
}