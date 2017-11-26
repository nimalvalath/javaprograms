class StackTest{
	public static void main(String[] args) {
		Stack stackObj= new Stack(10);
		stackObj.displayStackInitialConfiguration();
		System.out.println("insertion begin value 10");
		stackObj.insert(10);
		System.out.println("insert value 20");
		stackObj.insert(20);
		System.out.println("insert value 30");
		stackObj.insert(30);
		System.out.println("insert value 40");
		stackObj.insert(40);
		System.out.println("insert value 50");
		stackObj.insert(50);
		System.out.println("insert value 60");
		stackObj.insert(60);
		
		System.out.println("Stack pop begins");
		stackObj.remove();
		stackObj.displayStack();
		stackObj.remove();
		stackObj.displayStack();
		stackObj.remove();
		stackObj.displayStack();
		stackObj.remove();
		stackObj.displayStack();
		stackObj.remove();
		//stackObj.remove();//  exceptions
		//stackObj.remove();

		stackObj.displayStack();
	}
}