import java.io.File;
import java.awt.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import org.junit.*;

public class MostCommonWords {
	private String textPath = "mobydick.txt";
	private String stopWordsPath = "stop-words.txt";
	private ArrayList<String> text = new ArrayList<String>();
	private ArrayList<String> stopWords = new ArrayList<String>();
	private int maxPerList = 2463;
	ArrayList<String> List1 = new ArrayList<String>();
	ArrayList<String> List2 = new ArrayList<String>();
	ArrayList<String> List3 = new ArrayList<String>();
	ArrayList<String> List4 = new ArrayList<String>();
	ArrayList<String> List5 = new ArrayList<String>();
	ArrayList<String> List6 = new ArrayList<String>();
	ArrayList<String> List7 = new ArrayList<String>();
	ArrayList<String> finalList = new ArrayList<String>();
	ArrayList<Integer> numOfOccurences = new ArrayList<>();

	public MostCommonWords() {
		super();

	}

	public String getTextPath() {
		return textPath;
	}

	public ArrayList<String> getStopWords() {
		return stopWords;
	}

	public ArrayList<String> getList1() {
		return List1;
	}

	public ArrayList<String> getList2() {
		return List2;
	}

	public ArrayList<String> getList3() {
		return List3;
	}

	public ArrayList<String> getList4() {
		return List4;
	}

	public ArrayList<String> getList5() {
		return List5;
	}

	public ArrayList<String> getList6() {
		return List6;
	}

	public ArrayList<String> getList7() {
		return List7;
	}

	public ArrayList<String> getFinalList() {
		return finalList;
	}

	public ArrayList<Integer> getNumOfOccurences() {
		return numOfOccurences;
	}

	/**
	 * @return the text
	 */
	public String getText(int i) {
		return text.get(i);
	}

	/**
	 * @param textPath
	 *            the textPath to set
	 */
	public void setTextPath(String textPath) {
		this.textPath = textPath;
	}

	/**
	 * @param i
	 * @return the stopWords
	 */
	public String getStopWords(int i) {

		return stopWords.get(i);
	}

	// create array list with stop words
	public void createStopList() throws FileNotFoundException {
		Scanner s = new Scanner(new File(stopWordsPath));
		while (s.hasNext()) {
			stopWords.add(s.next());
		}
		s.close();
	}

	public int countWords() throws FileNotFoundException {

		int wordCount = 0;
		return wordCount;
	}

	public void textToList(String text) throws FileNotFoundException {
		Scanner b = new Scanner(new File(text));

		int currentWord = 0;
		int maxForThisList = maxPerList;

		while (b.hasNext() && currentWord <= maxPerList) {
			String wordToAdd = b.next();
			wordToAdd = wordToAdd.replaceAll("[^A-Za-z]", "").toLowerCase();
			List1.add(wordToAdd);
			// System.out.println(wordToAdd);
			currentWord++;
		}

		maxForThisList = maxPerList + maxPerList;
		while (b.hasNext() && currentWord < maxForThisList) {
			String wordToAdd = b.next();
			wordToAdd = wordToAdd.replaceAll("[^A-Za-z]", "").toLowerCase();
			List2.add(wordToAdd);
			currentWord++;
		}

		maxForThisList = maxForThisList + maxPerList;
		while (b.hasNext() && currentWord < maxForThisList) {
			String wordToAdd = b.next();
			wordToAdd = wordToAdd.replaceAll("[^A-Za-z]", "").toLowerCase();
			List3.add(wordToAdd);
			currentWord++;
		}

		maxForThisList = maxForThisList + maxPerList;
		while (b.hasNext() && currentWord < maxForThisList) {
			String wordToAdd = b.next();
			wordToAdd = wordToAdd.replaceAll("[^A-Za-z]", "").toLowerCase();
			List4.add(wordToAdd);
			currentWord++;
		}

		maxForThisList = maxForThisList + maxPerList;
		while (b.hasNext() && currentWord < maxForThisList) {
			String wordToAdd = b.next();
			wordToAdd = wordToAdd.replaceAll("[^A-Za-z]", "").toLowerCase();
			List5.add(wordToAdd.toLowerCase());
			currentWord++;
		}

		maxForThisList = maxForThisList + maxPerList;
		while (b.hasNext() && currentWord < maxForThisList) {
			String wordToAdd = b.next();
			wordToAdd = wordToAdd.replaceAll("[^A-Za-z]", "").toLowerCase();
			List6.add(wordToAdd.toLowerCase());
			currentWord++;
		}

		maxForThisList = maxForThisList + maxPerList;
		while (b.hasNext() && currentWord < maxForThisList) {
			String wordToAdd = b.next();
			wordToAdd = wordToAdd.replaceAll("[^A-Za-z]", "").toLowerCase();
			List7.add(wordToAdd);
			currentWord++;
		}
	}

	public void removeStopWords() {
		int removed = 0;
		int notRemoved = 0;
		int wdsInFile = 0;
		String toEliminate = null;
		for (int i = 0; i < stopWords.size(); i++) {
			toEliminate = stopWords.get(i);
			List1.removeAll(Collections.singleton(toEliminate));
		}
		for (int i = 0; i < stopWords.size(); i++) {
			toEliminate = stopWords.get(i);
			List2.removeAll(Collections.singleton(toEliminate));
		}
		for (int i = 0; i < stopWords.size(); i++) {
			toEliminate = stopWords.get(i);
			List3.removeAll(Collections.singleton(toEliminate));
		}
		for (int i = 0; i < stopWords.size(); i++) {
			toEliminate = stopWords.get(i);
			List4.removeAll(Collections.singleton(toEliminate));
		}
		for (int i = 0; i < stopWords.size(); i++) {
			toEliminate = stopWords.get(i);
			List5.removeAll(Collections.singleton(toEliminate));
		}
		for (int i = 0; i < stopWords.size(); i++) {
			toEliminate = stopWords.get(i);
			List6.removeAll(Collections.singleton(toEliminate));
		}
		for (int i = 0; i < stopWords.size(); i++) {
			toEliminate = stopWords.get(i);
			List7.removeAll(Collections.singleton(toEliminate));
		}

	}

	public void order() {
		//int list = 0;
		int numLists = 7;

		finalList.add(List1.get(0));
		numOfOccurences.add(0);	
		for (int i = 1; i < numLists + 1; i++) {
			int list = i;
			ArrayList<String> listInUse = new ArrayList();
			switch (list) {
			case 1:
				listInUse = List1;
				break;
			case 2:
				listInUse = List2;
				break;
			case 3:
				listInUse = List3;
				break;
			case 4:
				listInUse = List4;
				break;
			case 5:
				listInUse = List5;
				break;
			case 6:
				listInUse = List6;
				break;
			case 7:
				listInUse = List7;
				break;
			default:
				listInUse = null;
				System.out.println("This list does not exist");
				break;
			}
			//populating final List and numOfOccurences 
			for (int n = 0; n < listInUse.size(); n++) {
				if (finalList.size() != 0) {
					if(finalList.contains(listInUse.get(n))) {
					int value=numOfOccurences.get(finalList.indexOf(listInUse.get(n)));
					value++;
					numOfOccurences.set(finalList.indexOf(listInUse.get(n)), value);
					}else {
					finalList.add(listInUse.get(n));
					numOfOccurences.add(1);
					}
				} else {
					System.out.println("The  final list is initialized");

				}
			}

		}
	}
	public void sort() {
		int in, out;
		int temp;
		String temp2;
		int nElems=numOfOccurences.size();
		int numToShift;
		String wordToShift;
		for (out = 0; out < nElems; out++) // out is dividing line
		{
			temp = numOfOccurences.get(out); // remove marked item
			temp2=finalList.get(out);
			
			in = out; 
			while (in >0 && numOfOccurences.get(in-1) > temp) // until one is smaller,
			{	//This is where my problem is...  Please help!
				numToShift=numOfOccurences.get(in-1);
				wordToShift=finalList.get(in-1);
				System.out.println(numToShift+" "+wordToShift+" "+in);
				numOfOccurences.set(in, numToShift); // shift item to right
				finalList.set(in, wordToShift);
				--in; // go left one position
				
			}
			//System.out.println(temp+" "+temp2);
			numOfOccurences.set(in, temp);// insert marked item
			finalList.set(in, temp2);
			//System.out.println(finalList.toString());
			//System.out.println(numOfOccurences.toString());
			
		} // end for

			
	}
	public void alphabetize() {
		
	}
}
