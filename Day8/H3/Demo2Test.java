import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Demo2Test {

	Demo2 d = new Demo2();
	
	@Test
	void test() {
		
		boolean res = d.palindromeCheck("malayalam");
		
		assertEquals(true, res);
	}

}
