import java.io.FileNotFoundException;

public class Tester1 {

	public static void main(String[] args) throws FileNotFoundException {
		MostCommonWords test = new MostCommonWords();
		test.createStopList();
		System.out.println(test.getStopWords(3));
	

	}

}
