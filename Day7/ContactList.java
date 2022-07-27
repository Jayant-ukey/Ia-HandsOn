package com.ia.hand.tweent2Ju;

/*
	3) Create a Collection “ContactList” using HashMap to store name and phone number of contacts added.
	The program should use appropriate generics (String, Integer) and have the following abilities:
	
	a) Check if a particular key exists or not.
	b) Check if a particular value exists or not.
	c) Use Iterator to loop through the map.

*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ContactList {

	public static void main(String[] args) {
		
		HashMap<String,Integer> cont = new HashMap<>();
		
		cont.put("Jay",1234567890);
		cont.put("Nik",293847920);
		cont.put("Sarvesh",1293847920);
		cont.put("Vishal",329384792);
		cont.put("Mohit",729384792);

		Scanner sc = new Scanner(System.in);
		
		//TO check whether key is present or not
		System.out.print("Enter any key to find wheather it is there or not : ");
		String k = sc.nextLine();
		
		if(cont.containsKey(k))
			System.out.println(k+ " is present in HashMap");
		
		else
			System.out.println(k+ " Key is not present");
		
		
		
		//TO check whether key is present or not
		System.out.print("\nEnter any value : ");
		int s = sc.nextInt();
		
		if(cont.containsValue(s))
			System.out.println(s+ " is present in HashMap\n");
	
		else
			System.out.println(s+ " Value is not present\n");
		
		
		//Iterator 
	
		Iterator<Map.Entry<String,Integer> > itr = cont.entrySet().iterator();
		
		while(itr.hasNext()) {
			Map.Entry<String,Integer> entry = itr.next();
			System.out.println("Keys : "+entry.getKey()+ ", Value : "+entry.getValue());
		}


		
	}

}
