import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Demo1Test {

	@Test
	void testStringConcat() {
		Demo1 d = new Demo1();
		String s = d.stringConcat("Tom", "&Jerry");
		assertEquals("Tom&Jerry",s);
	}

}
