import static org.junit.Assert.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.junit.Test;

public class Test_10MostCommonWords {

	@Test
	public void test() throws IOException {
		MostCommonWords2 test=new MostCommonWords2();
		test.createStopList();
		test.toHashMap("testText1.txt");
		test.top10words();
		HashMap<String, Integer>top=test.getFinal10();
		boolean version=top.containsKey("version");
		assertEquals(version, true);

	}

}
