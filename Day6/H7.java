package com.ia.hand.tweentoneJu;

/*
	evelop a java class with a instance variable H1 (HashSet) add a method saveCountryNames(String CountryName) ,
	the method should add the passed country to a HashSet (H1) and return the added HashSet(H1).
	Develop a method getCountry(String CountryName) which iterates through the HashSet and
	returns the country if exist else return null.
	
	NOTE: You can test the methods using a main method.

*/

import java.util.HashSet;
import java.util.Iterator;

public class H7 {
	
	HashSet<String> h1 = new HashSet<>();

	HashSet<String> saveCountryNames(String CountryName) {
		
		h1.add(CountryName);
		
		return h1;
	}
	
	public String getCountry(String CountryName) {
		String s = "null";
		Iterator itr = h1.iterator();
		
		while(itr.hasNext()) {
			if(itr.next().equals(CountryName))
				s=CountryName;
		}
		
		return s;
	}
	
	public static void main(String[] args) {
		
		H7 h = new H7();
		h.saveCountryNames("India");
		h.saveCountryNames("Japan");
		h.saveCountryNames("USA");
		
		System.out.println(h.getCountry("India"));
		System.out.println(h.getCountry("Nepal"));
	}
}
