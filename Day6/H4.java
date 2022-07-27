package com.ia.hand.tweentoneJu;

import java.util.Iterator;
import java.util.LinkedList;

/*
 *Implement the assignment 1 using Linked List 
 */

public class H4 {

	public static void main(String[] args) {
		
		LinkedList<String> ob = new LinkedList<>();
		
		ob.add("January");
		ob.add("February");
		ob.add("March");
		ob.add("April");
		ob.add("May");
		ob.add("June");
		ob.add("July");
		ob.add("Augest");
		ob.add("September");
		ob.add("October");
		ob.add("November");
		ob.add("December");

		Iterator itr = ob.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
