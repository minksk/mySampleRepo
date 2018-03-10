import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class Test_TEXTTOLIST {

	@Test
	void test() throws FileNotFoundException {
		MostCommonWords mcw=new MostCommonWords();
		mcw.textToList("smallSample.txt");
		ArrayList<String> actual=new ArrayList();
		actual=mcw.getList1();
		ArrayList<String> compare= new ArrayList();
		compare.add("The");
		compare.add("cat");
		compare.add("jumped");
		compare.add("over");
		compare.add("the");

		//TODO figure out why this assertion isn't working
		assert(compare.get(1)==actual.get(1));
		assert(compare.get(2)==actual.get(2));
	}
	void test1()throws FileNotFoundException {
		//This will test that things are populating to List2 as expected.
	}
}
