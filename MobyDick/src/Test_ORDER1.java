import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class Test_ORDER1 {

	@Test
	void test() throws FileNotFoundException {
		MostCommonWords test= new MostCommonWords();
		test.createStopList();
		test.textToList("smallSample.txt");
		test.removeStopWords();
		test.order();
		ArrayList<String>actual=test.getFinalList();
		ArrayList<String>compare=new ArrayList();
		compare.add("cat");
		compare.add("jumped");
		
		
		assertEquals(actual.get(0), compare.get(0));
		assertEquals(actual.get(1), compare.get(1));
		
	}

}
