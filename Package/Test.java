package com.nimal.ems.test;

import com.nimal.ems.hr.Employee;

public class Test {
	public static void main(String[] args) {
		System.out.println("123");
		Employee emp= new Employee(123, "jack", 606060);
		
		System.out.println(emp.id);
		System.out.println(emp.name);
		System.out.println(emp.salary);

	}
}