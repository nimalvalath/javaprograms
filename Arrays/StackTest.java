class StackTest{
	public static void main(String[] args) {
		Stack stackObj= new Stack(10);
		stackObj.displayStackInitialConfiguration();
		
		stackObj.insert(10);
		stackObj.insert(20);
		stackObj.insert(30);
		stackObj.insert(40);
		stackObj.insert(50);
		stackObj.insert(60);
		
		stackObj.remove();
		stackObj.remove();
		stackObj.remove();
		stackObj.remove();
		stackObj.remove();
		//stackObj.remove();//  exceptions
		//stackObj.remove();

		stackObj.displayStack();
	}
}