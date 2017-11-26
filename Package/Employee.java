package com.nimal.ems.hr;

public class Employee {
	
	public	int id;
	public String name;
	public double salary;

	public Employee(){
		id=-1;
		name="not defined";
		salary=1;
	}
	public Employee(int id, String name, double salary){
		this(id,name);
		this.salary=salary;

	}
	public Employee(int id,String name){
		this();
		this.id=id;
		this.name=name;
	}
	public void doSomething(){
		System.out.println("Employee is doing something");
	}
	
}