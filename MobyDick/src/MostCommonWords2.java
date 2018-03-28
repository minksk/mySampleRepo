import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class MostCommonWords2 {
	private String textPath = "mobydick.txt";
	private String stopWordsPath = "stop-words.txt";
	private ArrayList<String> text = new ArrayList<String>();
	private ArrayList<String> stopWords = new ArrayList<String>();
	HashMap<String, Integer> hmap = new HashMap<String, Integer>();
	HashMap<String, Integer> final10 = new HashMap<String, Integer>();
	private int topNum = 10;

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

	/**
	 * @return the final10
	 */
	public HashMap<String, Integer> getFinal10() {
		return final10;
	}

	/**
	 * @return the topNum
	 */
	public int getTopNum() {
		return topNum;
	}

	public void createStopList() throws FileNotFoundException {
		Scanner s = new Scanner(new File(stopWordsPath));
		while (s.hasNext()) {
			stopWords.add(s.next());
		}
		s.close();
	}

	public void toHashMap(String textPath) throws FileNotFoundException {
		Scanner b = new Scanner(new File(textPath));
		while (b.hasNext()) {
			String word = b.next();
			word = word.replaceAll(""
					+ "[^A-Za-z]$", "").toLowerCase();

			if (stopWords.indexOf(word) <= 0) {
				if (hmap.containsKey(word)) {
					int value = hmap.get(word);
					value++;
					hmap.replace(word, value);
				} else {
					hmap.put(word, 1);

				}

			}

		}
	}

	public void top10words() {
		Map.Entry<String, Integer> maxEntry = null;

		for (int i = 0; i < topNum; i++) {
			for (Map.Entry<String, Integer> entry : hmap.entrySet()) {
				if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
					maxEntry = entry;

				}
			}
			System.out.println(maxEntry);
			final10.put(maxEntry.getKey(), maxEntry.getValue());
			hmap.replace(maxEntry.getKey(), 0);
		}
	}
}