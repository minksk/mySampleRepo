import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class Test_REMOVEPUNCTUATION {

	@Test
	void test() throws FileNotFoundException {
		MostCommonWords test= new MostCommonWords();
		test.createStopList();
		test.textToList("smallSample.txt");
		test.removePunctuation();
		ArrayList<String> actual=test.getList1();
		ArrayList<String> compare=new ArrayList();
		compare.add(5, "hat");
		compare.add(17, "moon");
		assertEquals(compare.get(5), actual.get(5));
		assertEquals(compare.get(17), actual.get(17));
	}

}
