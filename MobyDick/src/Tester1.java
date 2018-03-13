import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Tester1 {

	public static void main(String[] args) throws FileNotFoundException {
		MostCommonWords test = new MostCommonWords();
		test.createStopList();
		test.textToList("TestText1.txt");
		test.removeStopWords();
		test.order();
		ArrayList<String>words=test.getList1();
		ArrayList<String>storage=test.getFinalList();
		ArrayList<Integer>numList=test.getNumOfOccurences();
		for(int i=0; i<storage.size();i++) {
			System.out.println(storage.get(i)+" "+numList.get(i));
		}
		test.sort();
		System.out.println("post sort");
		for (int i=0; i<numList.size();i++) {
			
			System.out.println(storage.get(i)+" "+numList.get(i));
		}
	}
	

	
}
