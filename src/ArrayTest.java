import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayTest {

	@Test
	void test() {
		ezRays newRay = new ezRays();
		
		newRay.add("String");
		assertTrue(newRay.contains(null) == false);
//		newRay.contains("String");
//		newRay.get(-1);
//		newRay.get(0);
//		
//		assertThrows(ArrayIndexOutOfBoundsException.class, () -> newRay.remove(-2), "index out of bounds should throw");
		

	}

}
