package com.jspiders.encapsulation;

public class Company {

	public static void main(String[] args) {
		Employee emp=new Employee();
		//emp.a;//CTE(Direct access is restricted)
		System.out.println(emp.getter());//10
		emp.setter(20);
		System.out.println(emp.getter());

	}

}
