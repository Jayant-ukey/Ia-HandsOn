package com.ia.hand.tweentoneJu;

//Write a program to store a group of employee names into a HashSet, retrieve the elements one by one using an Iterator.

import java.util.HashSet;
import java.util.Iterator;

public class H8 {

	public static void main(String[] args) {
		
		HashSet<String> h = new HashSet<>();
		
		h.add("Jayant");
		h.add("Sarang");
		h.add("Nikhil");
		h.add("Vishal");
		
		Iterator<String> itr = h.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
