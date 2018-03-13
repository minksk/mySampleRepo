import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class Test_LIST7POP {

	@Test

	void testList7() throws FileNotFoundException {
		//Testing List 7
		String text="popTest.txt";
		MostCommonWords test=new MostCommonWords();
		test.textToList(text);
		ArrayList<String>actual=test.getList7();
		ArrayList<String>compare= new ArrayList();
		compare.add("abaddon");
		compare.add("abaft");
		compare.add("abaft");
		compare.add("abaisance");

		assertEquals(compare.get(0), actual.get(0));
		assertEquals(compare.get(1), actual.get(1));
		assertEquals(compare.get(2), actual.get(2));
	}

}
