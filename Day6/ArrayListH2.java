/*
	 Create an ArrayList that can store only Strings.
	Create a printAll method that will print all the elements of the ArrayList using an Iterator.
*/

import java.util.*;

public class ArrayListH2 {
	
	public static void printAll(ArrayList<String> a) {
		Iterator itr = a.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Jaguar");
		list.add("BMW");
		list.add("Mercedes");
		list.add("Ferrari");
		list.add("RR");

		printAll(list);
	}

}
