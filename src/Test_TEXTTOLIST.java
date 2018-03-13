import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class Test_TEXTTOLIST {

	

	@Test
	void testList1() throws FileNotFoundException {
		//Tests if List 1 populates as expected
		MostCommonWords mcw=new MostCommonWords();
		mcw.textToList("smallSample.txt");
		ArrayList<String> actual=mcw.getList1();
		ArrayList<String> compare= new ArrayList();
		compare.add("the");
		compare.add("cat");
		compare.add("jumped");
		compare.add("over");
		compare.add("the");

		
		assertEquals(compare.get(1), actual.get(1));
		assertEquals(compare.get(2), actual.get(2));
		assertEquals(compare.get(0), actual.get(0));
	}


	
	
}
