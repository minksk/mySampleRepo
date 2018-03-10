import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.Test;

class Test_STOPWORDLIST {

	@Test
	void test() throws FileNotFoundException {
		MostCommonWords mcw= new MostCommonWords();
		mcw.createStopList();
		assertEquals(mcw.getStopWords(0), "a");
		assertEquals(mcw.getStopWords(1), "about");
	}

}
