public class Employee{
	int id;
	String name;
	double salary;
	int mobNumber;
	String address;
	


	Employee(){
		id=-1;
		name="Not defined";
		salary=-1;
		mobNumber=0;
		address="not defined";
	}

	Employee(String name,double salary,String address){
		//explicit is called here always
		//this(); 
				/*this.id=id;
		this.salary=salary;*/
		this(123,name,salary,0,address);	
	}
	/*we can aslo call
		Employee(int id){
		
		this(id,"name",-2);
		
		}
		//this(id,name,salary)--> 3 params constructor like this
		//
	*/
	Employee(int id, String name, double salary,int mobNumber, String address){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.mobNumber=mobNumber;
		this.address=address;
	}

	public void doSomething(){
		System.out.println("Employee is doing something");
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public double getSalary(){
		return salary;
	}

}