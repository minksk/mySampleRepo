import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class Test_LIST3POP {

	@Test
	void testList3() throws FileNotFoundException {
		//Testing List 3
		String text="testText1.txt";
		MostCommonWords test=new MostCommonWords();
		test.textToList(text);
		ArrayList<String>actual=test.getList3();
		ArrayList<String>compare= new ArrayList();
		compare.add("hardship");
		compare.add("passage");
		compare.add("enlarge");
		compare.add("smart");
		compare.add("trustee");
		compare.add("crackpot");
		compare.add("soak");
		compare.add("fist");
		compare.add("keep");
		compare.add("pan");
		compare.add("vessel");
		compare.add("lift");
		compare.add("bring");
		compare.add("population");
		assertEquals(compare.get(0), actual.get(0));
		assertEquals(compare.get(1), actual.get(1));
		assertEquals(compare.get(2), actual.get(2));
	}

}
