import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Tester1 {

	public static void main(String[] args) throws FileNotFoundException {
		MostCommonWords test = new MostCommonWords();
		test.createStopList();
		//test.textToList("smallSample.txt");
		
		test.removeStopWords();
		ArrayList<String>list=test.getList1();
				
	for (int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
	}
		
	
		//test.sort();
		System.out.println("///////////////////post sort");
		
	}
	

	
}
