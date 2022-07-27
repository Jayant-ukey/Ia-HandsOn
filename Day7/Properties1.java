
/*
	5. Develop a method which iterates through the map M1 and creates an ArrayList with all the Country names stored as keys. This method should return the ArrayList.
	NOTE: You can test the methods using a main method.

*/

import java.util.*;

public class Properties1 {

	public static void main(String[] args) {
		
		Map<String,String> st = new HashMap<>();
		
		st.put("Maharashtra","Mumbai");
		st.put("Goa","Panji");
		st.put("Hariyana","Chandigarh");
		st.put("Madhya Pradesh","Bhopal");
		st.put("Sikkim","Gangatok");
		st.put("Himachal","Shimla");
		
		Iterator<Map.Entry<String, String>> itr = st.entrySet().iterator();
		
		while(itr.hasNext()) {
			Map.Entry<String, String> ent = itr.next();
			System.out.println(ent.getKey() +" : "+ent.getValue());
		}
		
	}

}
