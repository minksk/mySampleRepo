import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class Test_ALLLISTSPOPULATE {
	String text="testText1.txt";
	@Test
	void testList2()throws FileNotFoundException {
		//This will test that things are populating to List2 as expected.
		MostCommonWords test=new MostCommonWords();
		test.textToList(text);
		ArrayList<String>actual=test.getList2();
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
	void testList3() throws FileNotFoundException {
		//Testing List 3
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
	void testList4() throws FileNotFoundException {
		//Testing List 4
		MostCommonWords test=new MostCommonWords();
		test.textToList(text);
		ArrayList<String>actual=test.getList4();
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
	void testList5() throws FileNotFoundException {
		//Testing List 5
		MostCommonWords test=new MostCommonWords();
		test.textToList(text);
		ArrayList<String>actual=test.getList5();
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
	void testList6() throws FileNotFoundException {
		//Testing List 6
		MostCommonWords test=new MostCommonWords();
		test.textToList(text);
		ArrayList<String>actual=test.getList6();
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
	void testList7() throws FileNotFoundException {
		//Testing List 7
		MostCommonWords test=new MostCommonWords();
		test.textToList(text);
		ArrayList<String>actual=test.getList7();
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
