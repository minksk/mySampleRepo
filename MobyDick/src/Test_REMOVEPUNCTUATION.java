import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;

import org.junit.jupiter.api.Test;

class Test_REMOVEPUNCTUATION {

	@Test
	void test() throws FileNotFoundException {
		MostCommonWords2 test= new MostCommonWords2();
		test.createStopList();
		test.toHashMap("smallSample.txt");
		HashMap<String, Integer>compare=new HashMap<String, Integer>();
		HashMap<String, Integer>map= test.getHmap();
		assertEquals(map.containsKey("cat."), false);
	}

}
