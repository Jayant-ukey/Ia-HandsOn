package com.ia.hand.tweent6Ju;


/*
	Create an application for employee management with the following classes:

	a) Create an Employee class with following attributes and behaviors :
	i) int empId
	ii)String empName
	iii)String email
	iv)String gender
	v)float salary
	vi) void GetEmployeeDetails() -> prints employee details
	
	b) Create one more class EmployeeDB with the following attributes and behaviors.
	i)ArrayList list;
	ii) boolean addEmployee(Employee e) -> adds the employee object to the collection
	iii) boolean deleteEmployee(int empId) ->delete the employee object from the collection with the given empid
	iv) String showPaySlip(int empId) -> returns the payslip of the employee with the given empId
	
	Provide implementation for all the methods and test your program

*/

public class Employee {

	private int empId;
	private String empName;
	private String email;
	private String gender;
	private float salary;
	
	//Constructor
	public Employee(int empId, String empName, String email, String gender, float salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.email = email;
		this.gender = gender;
		this.salary = salary;
	}
	
	
	//method to print details
	void GetEmployeeDetails() {
		System.out.println("Employee id : "+empId+"\nEmployee name : "+empName+"\nEmail : "+email+"\nGender : "+gender+"\nSalary : "+salary);
	}


	//Getters and setter
	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", email=" + email + ", gender=" + gender
				+ ", salary=" + salary + "]";
	}
	
	
}
