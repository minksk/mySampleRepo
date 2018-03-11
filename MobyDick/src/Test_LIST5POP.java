import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class Test_LIST5POP {

	@Test
	void testList5() throws FileNotFoundException {
		//Testing List 5
		String text="popTest.txt";
		MostCommonWords test=new MostCommonWords();
		test.textToList(text);
		ArrayList<String>actual=test.getList5();
		ArrayList<String>compare= new ArrayList();
		
		compare.add("abacus");
		compare.add("abacus");
		compare.add("abada");
		compare.add("abaddon");
		compare.add("abaddon");
		compare.add("abaft");
		compare.add("abaft");

		assertEquals(compare.get(0), actual.get(0));
		assertEquals(compare.get(1), actual.get(1));
		assertEquals(compare.get(2), actual.get(2));
	}

}
