package com.ia.hand.tweentoneJu;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/*
 *  Write a program that will have a Vector which is capable of storing Employee objects.
 *  Use an Iterator and enumeration to list all the elements of the Vector.
 */

class Employee{
	
	private int id;
	private String name;
	private double salar;
	
	public Employee(int id, String name, double salar) {
		super();
		this.id = id;
		this.name = name;
		this.salar = salar;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalar() {
		return salar;
	}

	public void setSalar(double salar) {
		this.salar = salar;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salar + "]";
	}
	
	
	
}

public class H6 {

	public static void main(String[] args) {
		
		Vector<Employee> emp = new Vector<>();
		
		emp.add(new Employee(1,"Jay",45000));
		emp.add(new Employee(2,"Sanket",40000));
		emp.add(new Employee(3,"Nikhil",35000));
		emp.add(new Employee(4,"Vishal",55000));
		
		System.out.println("Using Iterator");
		Iterator itr = emp.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("\nUsing Enumeration");
		
		Enumeration<Employee> ob = emp.elements();
		while(ob.hasMoreElements()) {
			System.out.println(ob.nextElement());
		}
		
		}
}
