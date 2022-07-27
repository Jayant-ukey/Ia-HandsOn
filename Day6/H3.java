package com.ia.hand.tweentoneJu;

import java.util.ArrayList;
import java.util.Iterator;

/*
 *Create an ArrayList that can store only numbers like int,float,double,etc, 
 *but not any other data type. 
 */

public class H3 {
	
	public static void main(String[] args) {
		
		ArrayList<Number> ob = new ArrayList<>();
		
		
			ob.add(12);
			ob.add(123456.45f);
			ob.add(1234.45);
			//ob.add("Jayant");
			
			Iterator itr = ob.iterator();
			
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		
	}
}
