import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Tester1 {

	public static void main(String[] args) throws FileNotFoundException {
		MostCommonWords test = new MostCommonWords();
		test.createStopList();
		test.textToList("smallSample.txt");
		ArrayList<String>List=test.getList1();
		for (int i=0;i<List.size();i++) {
			System.out.println(i+" "+List.get(i));
		}
		
		
		

	}

	
}
