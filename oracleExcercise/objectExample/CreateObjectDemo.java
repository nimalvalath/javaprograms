public class CreateObjectDemo{
	public static void main(String[] args) {
		

		Point originOne= new Point(23,94);
		Rectangle rectOne= new Rectangle(originOne,100,200);
		Rectangle rectTwo= new Rectangle(50,100);

		System.out.println("width of RectOne: "+rectOne.width);
		System.out.println("Height of rectOne: "+rectOne.height);	
		System.out.println("Area of RectOne: "+rectOne.getArea());

		rectTwo.origin=originOne;

		System.out.println("X position of RectTwo:"+rectTwo.origin.x);
		System.out.println("Y position of RectTwo:"+rectTwo.origin.y);


		rectTwo.move(40,72);
		System.out.println("X position of RectTwo:"+rectTwo.origin.x);
		System.out.println("Y position of RectTwo:"+rectTwo.origin.y);



	}
}