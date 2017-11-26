class EmployeeTest3{
	public static void main(String[] args) {
		Employee emp3= new Employee(1001,60000.00);
		displayEmpDetails(emp3);
	}
	public static void displayEmpDetails(Employee temp){
		System.out.println("Explicit constructor example");
		System.out.println("____________________________");
		System.out.println("out put  defined values");
		System.out.println("________________________");
		System.out.println("emp id-->"+temp.getId());
		System.out.println("emp name-->"+temp.getName());
		System.out.println("emp salary-->"+temp.getSalary());
	}
}