package com.ia.hand.tweent7Ju;

/*
	Write a program in java for LambdaExpressionFilter demo. The filter will filter the list of electronic products
	whose cost is less than 20000 and print the details of productsin the list whose cost is greater than 20000
	Step1: Create an Electronic Product bean class with attributes id , name and price
	Step2: create a main method and add list of products created to product list
	Step3: create a stream object and filter the list using stream filter and lambda expression
	Step4: Using lambda expression iterate through list to print product name and product price
	
	Sample output
	Iphone 6S: 65000.0
	Sony Xperia: 25000.0
	Redmi4 : 26000.0


*/

import java.util.ArrayList;
import java.util.stream.Stream;

class ElectronicProduct{
	
	int id;
	String name;
	double price;
	public ElectronicProduct(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
}

public class LambdaExpressionFilter {

	public static void main(String[] args) {
		
		ArrayList<ElectronicProduct> list = new ArrayList<ElectronicProduct>();
		
		list.add(new ElectronicProduct(1,"Samsung",17000));
		list.add(new ElectronicProduct(3,"Iphone 6S",65000));
		list.add(new ElectronicProduct(2,"Sony Xperia",25000));
		list.add(new ElectronicProduct(4,"Nokia Lumia",15000));
		list.add(new ElectronicProduct(5,"Redmi4 ",26000));
		list.add(new ElectronicProduct(6,"Lenevo",19000));
		
		Stream<ElectronicProduct> data = list.stream().filter(p->p.price > 20000);
		
		data.forEach(product-> System.out.println(product.name+": "+product.price));
		
	}
	
}
