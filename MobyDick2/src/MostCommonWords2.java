import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MostCommonWords2 {
	private String textPath = "mobydick.txt";
	private String stopWordsPath = "stop-words.txt";
	private ArrayList<String> text = new ArrayList<String>();
	private ArrayList<String> stopWords = new ArrayList<String>();
	 HashMap<String, Integer> hmap = new HashMap<String, Integer>();
	 
		/**
	 * @return the textPath
	 */
	public String getTextPath() {
		return textPath;
	}

	/**
	 * @return the stopWordsPath
	 */
	public String getStopWordsPath() {
		return stopWordsPath;
	}

	/**
	 * @return the text
	 */
	public ArrayList<String> getText() {
		return text;
	}

	/**
	 * @return the stopWords
	 */
	public String getStopWords(int i) {
		return stopWords.get(i);
	}

	/**
	 * @return the hmap
	 */
	public HashMap<String, Integer> getHmap() {
		return hmap;
	}

		public void createStopList() throws FileNotFoundException {
			Scanner s = new Scanner(new File(stopWordsPath));
			while (s.hasNext()) {
				stopWords.add(s.next());
			}
			s.close();
		}
		public void toHashMap(String textPath) throws FileNotFoundException {
			Scanner b =new Scanner(new File(textPath));
			while(b.hasNext()) {
				String word=b.next();
				System.out.println(word);
				
				if(hmap.containsKey(word)) {
					int value=hmap.get(word);
					value++;
					hmap.replace(word, value);
				}else {
					hmap.put(word, 1);
				}
			}
		}
		public void removeStopWords() {
			
		}
}
