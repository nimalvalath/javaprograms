class ParseString{
	public static void main(String[] args) {
		String empId="1001";
		System.out.println("integer value to employee: "+Integer.parseInt(empId));

		String empSalary="60000.00";
		System.out.println("Double value of empSalary: "+Double.parseDouble(empSalary));

try{
		String employeeId="emp1";
		System.out.println(Integer.parseInt(employeeId));


}
catch(NumberFormatException e){
	System.out.println(e);
}
		}
}