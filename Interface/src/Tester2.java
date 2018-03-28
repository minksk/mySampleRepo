import java.awt.List;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		MostCommonWords2 test = new MostCommonWords2();
		test.createStopList();
		test.toHashMap("mobydick.txt");
		HashMap<String, Integer>map= test.getHmap();
		HashMap<String, Integer>f10=test.getFinal10();
		ArrayList <String>commonWords=new ArrayList();
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			//System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		//System.out.println(map.entrySet());
		//test.top10words();
		//System.out.println(f10.toString());
		System.out.println(test.wordCount);


	}

}
