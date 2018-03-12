import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class Test_ORDER2 {

	@Test
	void test() throws FileNotFoundException {
		//this will test if the items are ordered by number
		MostCommonWords test= new MostCommonWords();
		test.createStopList();
		test.textToList("testText1.txt");
		test.removeStopWords();
		test.order();
		ArrayList<String>actualWords=test.getFinalList();
		ArrayList<Integer>actualNum=test.getNumOfOccurences();
		//this test confirms items are being ordered by number of times they appear
		assertEquals(actualWords.get(0), "version");

		
	}

}
