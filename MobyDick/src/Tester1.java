import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Tester1 {

	public static void main(String[] args) throws FileNotFoundException {
		MostCommonWords2 test = new MostCommonWords2();
		test.createStopList();
		test.toHashMap("smallSample.txt");
		//test.removeStopWords();
		
		HashMap<String, Integer>map= test.getHmap();
		
	
			System.out.println(map.entrySet());
	
		//test.sort();
		System.out.println("///////////////////post sort");
		
	}
	

	
}
