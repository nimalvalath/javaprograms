class EmployeeTest4{
	public static void main(String[] args) {
		Employee emp1= new Employee();
		Employee emp2= new Employee("viki",40000.00," abcd hgasjsh asgjs");
		Employee emp3= new Employee(101, "tom", 50000.00,944526112,"qawtw jhgu jghjds");
		Employee emp4= new Employee("miki",403456.00," dfdss asgjs");
		Employee emp5= new Employee(102, "Jerry", 50001.00,804526112,"q12 jhgu jghjds");
		displayEmpDetails(emp1);
		displayEmpDetails(emp2);
		displayEmpDetails(emp3);
		displayEmpDetails(emp4);
		displayEmpDetails(emp5);
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