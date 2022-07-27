package com.ia.hand.tweent2Ju;

/*
 	Create a Collection called HashMap which is capable of storing String objects.

	The program should have the following abilities
	a) Check if a particular key exists or not.
	b) Check if a particular value exists or not.
	c) Use Iterator to loop through the map.

*/


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class H1 {

	public static void main(String[] args) {
		
		HashMap<String,String> emp = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		
		emp.put("Jay","Nagpur");
		emp.put("Nik","pune");
		emp.put("Vishal","Banglore");
		emp.put("Sarvesh","Mumbai");
		
		System.out.print("Enter any key to find wheather it is there or not : ");
		String k = sc.nextLine();
		
		//TO check whether key is present or not
		if(emp.containsKey(k))
			System.out.println(k+ " is present in HashMap");
		
		else
			System.out.println(k+ " Key is not present");
		
		
		
		//TO check whether key is present or not
		System.out.print("\nEnter any value : ");
		String s = sc.nextLine();
		
		if(emp.containsValue(s))
			System.out.println(s+ " is present in HashMap\n");
	
		else
			System.out.println(s+ " Value is not present\n");
		
		//Iterator 
		
		Iterator<Map.Entry<String, String> > itr = emp.entrySet().iterator();
		
		while(itr.hasNext()) {
			Map.Entry<String, String> entry = itr.next();
			System.out.println("Keys : "+entry.getKey()+ ", Value : "+entry.getValue());
		}

	}
	
}
