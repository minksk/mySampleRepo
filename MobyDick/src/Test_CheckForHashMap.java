import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.util.HashMap;

import org.junit.jupiter.api.Test;

class Test_CheckForHashMap {

	@Test
	void test() throws FileNotFoundException {
		MostCommonWords2 test=new MostCommonWords2();
		test.toHashMap("smallSample.txt");
		HashMap<String, Integer>hashMap=  test.getHmap();
		boolean contains=hashMap.containsKey("cat");
		assertEquals(contains, true);
	}

}
