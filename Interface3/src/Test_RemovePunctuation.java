import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.junit.Test;

public class Test_RemovePunctuation {

	@Test
	public void test() throws IOException {
		MostCommonWords2 test= new MostCommonWords2();
		test.createStopList();
		test.toHashMap("smallSample.txt");
		HashMap<String, Integer>compare=new HashMap<String, Integer>();
		HashMap<String, Integer>map= test.getHmap();
		assertEquals(map.containsKey("cat."), false);
	}

}
