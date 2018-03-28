import java.io.FileNotFoundException;
import java.util.HashMap;

/**
 * 
 */

/**
 * @author kathe
 *
 */
public class Tester2 {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		MostCommonWords2 test = new MostCommonWords2();
		test.createStopList();
		test.toHashMap("mobydick.txt");
		HashMap<String, Integer>map= test.getHmap();
		HashMap<String, Integer>f10=test.getFinal10();
		System.out.println(map.entrySet());
		test.top10words();
		//System.out.println(f10.containsKey("version"));

		System.out.println(f10.entrySet());

	}

}
