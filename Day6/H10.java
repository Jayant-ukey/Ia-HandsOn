package com.ia.hand.tweentoneJu;

//Implement the assignment 7 using TreeSet

import java.util.Iterator;
import java.util.TreeSet;

public class H10 {
	
	TreeSet<String> ts = new TreeSet<>();
	
	TreeSet<String> saveCountryNames(String CountryName) {
		ts.add(CountryName);
		
		return ts;
	}
	
	public String getCountry(String CountryName) {
		String s = "null";
		Iterator itr = ts.iterator();
		
		while(itr.hasNext()) {
			if(itr.next().equals(CountryName))
				s=CountryName;
		}
		
		return s;
	}
	
	public static void main(String[] args) {
		
		H10 h = new H10();
		h.saveCountryNames("India");
		h.saveCountryNames("Japan");
		h.saveCountryNames("USA");
		
		System.out.println(h.getCountry("India"));
		System.out.println(h.getCountry("USA"));
		System.out.println(h.getCountry("Korea"));
	}


}
