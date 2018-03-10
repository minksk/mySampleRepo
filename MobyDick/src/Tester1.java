import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Tester1 {

	public static void main(String[] args) throws FileNotFoundException {
		MostCommonWords test = new MostCommonWords();
		test.createStopList();
		System.out.println(test.getStopWords(1));
		test.textToList("smallSample.txt");
		ArrayList<String> one=new ArrayList();
		one=test.getList1();
		System.out.println("List one: "+one.get(1));
		

	}

}
