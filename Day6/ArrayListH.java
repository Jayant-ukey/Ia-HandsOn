import java.util.*;

/*
 *Write a Java program to create an ArrayList, add all the months of a year and print the same. 
 */

public class ArrayListH {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<>();
		
		a.add("January");
		a.add("February");
		a.add("March");
		a.add("April");
		a.add("May");
		a.add("June");
		a.add("July");
		a.add("Augest");
		a.add("September");
		a.add("October");
		a.add("November");
		a.add("December");
		
		System.out.println(a);
		
		Iterator itr = a.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
