package com.ia.hand.tweent6Ju;

//Using LinkedList

import java.util.Iterator;
import java.util.LinkedList;

public class EmployeeDB {

	LinkedList<Employee> list = new LinkedList<Employee>();
	
	boolean addEmployee(Employee e) {
		return list.add(e);
	}
	
	boolean deleteEmployee(int empId) {
		
		boolean op = false;
		
		Iterator<Employee> itr = list.iterator();
		while(itr.hasNext()) {
			Employee e = itr.next();
			if(e.getEmpId() == empId) {
				op=true;
				itr.remove();
			}
		}
		
		return op;
	}
	
	String showPaySlip(int empId) {
		
		String st = "Wrong employee id";
		
		for(Employee e : list) {
			if(e.getEmpId() == empId) {
				st = "Payment of employee id "+empId+", is "+e.getSalary();
			}
		}
		return st;
	}
	
	public void listAll() {
		for(Employee e : list) {
			System.out.println(e);
		}
	}
	
	
	public static void main(String[] args) {
		EmployeeDB emp = new EmployeeDB();
		
		Employee e1 = new Employee(1,"Jay","jay@gmail.com","Male",45000);
		Employee e2 = new Employee(2,"Nik","jay@gmail.com","Male",45000);
		Employee e3 = new Employee(3,"Sarvesh","jay@gmail.com","Male",45000);
		Employee e4 = new Employee(4,"Vishal","jay@gmail.com","Male",45000);
		
		emp.addEmployee(e1);
		emp.addEmployee(e2);
		emp.addEmployee(e3);
		emp.addEmployee(e4);
		
		System.out.println("Printing Employee");
		emp.listAll();
		
		
		emp.deleteEmployee(2);
		System.out.println("After deleting one employee");
		emp.listAll();
		
		System.out.println(emp.showPaySlip(4));
		
		
	}
}




