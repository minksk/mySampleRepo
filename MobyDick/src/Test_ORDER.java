import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class Test_ORDER {

	@Test
	void test() throws FileNotFoundException {
		MostCommonWords test= new MostCommonWords();
		test.createStopList();
		test.textToList("smallSample.txt");
		test.removePunctuation();
		test.removeStopWords();
		test.order();
		ArrayList<String>actual=test.getList1();
		ArrayList<String>compare=new ArrayList();
		compare.add("cat");
		compare.add("jumped");
		compare.add("over");
		
		assertEquals(actual.get(0), compare.get(0));
		assertEquals(actual.get(1), compare.get(1));
		assertEquals(actual.get(2), compare.get(2));
	}

}
