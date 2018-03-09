import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ReadingArrainbow {

	@Test
	void test() throws FileNotFoundException {
		MostCommonWords test=new MostCommonWords();
		//test.setTextPath("testText1.txt");
		test.textToList();
		ArrayList <String> compare=null;
		compare.add("Original");
		compare.add("Transcriber's");
		compare.add("Notes");
		compare.add("This");
		compare.add("text");
		compare.add("is");
		compare.add("a");
		compare.add("combination");
		compare.add("of");
		compare.add("etexts,");
		for(int i=0; i<compare.size();i++) {
			equals(compare.get(i)==test.getText(i));
		}
	}

}
