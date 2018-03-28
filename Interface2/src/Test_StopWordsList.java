import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

public class Test_StopWordsList {

	@Test
	public void test() throws FileNotFoundException {
		MostCommonWords2 mcw= new MostCommonWords2();
		mcw.createStopList();
		assertEquals(mcw.getStopWords(0), "a");
		assertEquals(mcw.getStopWords(1), "about");
	}

}
