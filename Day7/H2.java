package com.ia.hand.tweent2Ju;

/*
	2) Write a program that will have a Properties class object which is capable of storing some States of India
	and their Capital. Use an Iterator to list all the elements stored in the Properties.
*/


import java.util.Properties;
import java.util.Set;
import java.util.Iterator;
import java.util.Map.Entry;

public class H2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Properties p = new Properties();
		
		p.setProperty("Maharashtra","Mumbai");
		p.setProperty("Goa","Panji");
		p.setProperty("Hariyana","Chandigarh");
		p.setProperty("Madhya Pradesh","Bhopal");
		p.setProperty("Sikkim","Gangatok");
		
		p.put("Himachal","Shimla");
		
		Set<Entry<Object, Object>> s = p.entrySet();
		Iterator<Entry<Object,Object>> i = s.iterator();
		
		while(i.hasNext()) {
			Entry<Object,Object> e = i.next();
			System.out.println(e);
		}
		
	}

}
