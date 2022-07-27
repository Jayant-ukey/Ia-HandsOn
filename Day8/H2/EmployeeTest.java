import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	ArrayList<String> emp = new ArrayList<>();
	
	Employee e = new Employee();
	
	@Test
	void test() {
		emp.add("Jayant");
		emp.add("Nikhil");
		emp.add("Sarvesh");
		emp.add("Vishal");
		
		
		System.out.println(emp);
		
		assertEquals("FOUND",e.findName(emp, "Nikhil"));
	}

}
