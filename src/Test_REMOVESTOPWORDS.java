import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class Test_REMOVESTOPWORDS {

	@Test
	void test() throws FileNotFoundException {
		MostCommonWords test=new MostCommonWords();
		test.createStopList();
		test.textToList("smallSample.txt");
		test.removeStopWords();
		ArrayList<String>actual=test.getList1();
		ArrayList<String>compare=new ArrayList();
		compare.add("cat");
		compare.add("jumped");
		compare.add("hat");
		assertEquals(compare.get(0), actual.get(0));
	}

}
