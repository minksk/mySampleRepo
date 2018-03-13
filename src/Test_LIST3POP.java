import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class Test_LIST3POP {

	@Test
	void testList3() throws FileNotFoundException {
		//Testing List 3
		String text="popTest.txt";
		MostCommonWords test=new MostCommonWords();
		test.textToList(text);
		ArrayList<String>actual=test.getList3();
		ArrayList<String>compare= new ArrayList();
		compare.add("abaci");
		compare.add("abacus");
		compare.add("abacus");
		compare.add("abacus");
		
		assertEquals(compare.get(0), actual.get(0));
		assertEquals(compare.get(1), actual.get(1));
		assertEquals(compare.get(2), actual.get(2));
	}

}
