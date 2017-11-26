//default constructor example
class EmployeeTest1{
	public static void main(String[] args) {
		Employee emp2= new Employee();
		displayEmpDetails(emp2);
		
	
	}
	public static void displayEmpDetails(Employee temp){
		System.out.println("Default constructor example");
		System.out.println("oout put  with default values");
		System.out.println("emp id-->"+temp.id);
		System.out.println("emp name-->"+temp.getName());
		System.out.println("emp salary-->"+temp.getSalary());
	}
	
}