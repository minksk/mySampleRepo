import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Tester1 {

	public static void main(String[] args) throws FileNotFoundException {
		MostCommonWords test = new MostCommonWords();
		test.createStopList();
		test.textToList("testText1.txt");
		ArrayList<String>List1=test.getList1();
		System.out.println(List1.get(2));
		
		

	}

}
