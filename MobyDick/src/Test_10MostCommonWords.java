import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.util.HashMap;

import org.junit.jupiter.api.Test;

class Test_10MostCommonWords {

	@Test
	void test() throws FileNotFoundException {
		MostCommonWords2 test=new MostCommonWords2();
		test.createStopList();
		test.toHashMap("testText1.txt");
		test.top10words();
		HashMap<String, Integer>top=test.getFinal10();
		boolean version=top.containsKey("version");
		assertEquals(version, true);
	}

}
