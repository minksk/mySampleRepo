import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class Test_LIST2POP {

	@Test
	void testList2()throws FileNotFoundException {
		//This will test that things are populating to List2 as expected.
		String text="popTest.txt";
		MostCommonWords test=new MostCommonWords();
		test.textToList(text);
		ArrayList<String>actual=test.getList2();
		ArrayList<String>compare= new ArrayList();
		compare.add("abacuses");
		compare.add("abaci");
		compare.add("abacus");
		compare.add("abacus");
		compare.add("abacus");
		compare.add("abacus");
		compare.add("abacus");
		compare.add("abada");
		compare.add("abaddon");
		compare.add("abaddon");
		compare.add("abaft");
		assertEquals(compare.get(0), actual.get(0));
		assertEquals(compare.get(1), actual.get(1));
		assertEquals(compare.get(2), actual.get(2));
	}
}
