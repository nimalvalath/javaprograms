class Association{
	public static void main(String[] args) {
		//Association is a weak relation between classes

		Bank obj = new Bank();
		Employee empObj= new Employee();
		//1:n
		//n:1
		//n:n
		//1:1
		obj.displayBankDetails();
		empObj.doSomething();

	}
}