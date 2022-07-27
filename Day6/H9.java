package com.ia.hand.tweentoneJu;

/*
	Create a Collection called TreeSet which is capable of storing String objects. Then try these following operations :
	a) Reverse the elements of the Collection.
	b) Iterate the elements of the TreeSet using Iterator.
	c) Check if a particular element exists or not.

*/


import java.util.Iterator;
import java.util.TreeSet;

public class H9 {

	public static void main(String[] args) {
		
		TreeSet<String> t = new TreeSet<>();
		
		t.add("Alibaba");
		t.add("Khiladi");
		t.add("Jimmi");
		t.add("Nakshal");
		t.add("Pirate");
		
		System.out.println(t);
		
		//For reversing the sequence
		TreeSet<String> des = (TreeSet<String>)t.descendingSet();
		
		//Iterator
		Iterator itr = des.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
