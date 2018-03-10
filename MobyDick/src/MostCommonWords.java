import java.io.File;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import org.junit.*;

public class MostCommonWords {
private String textPath="mobydick.txt";
private String stopWordsPath="stop-words.txt";
private ArrayList<String> text=new ArrayList<String>();
private ArrayList<String> stopWords=new ArrayList<String>();
private ArrayList<String> listOfLists= new ArrayList<String>();
ArrayList<String> List1 =new ArrayList<String>();
ArrayList<String> List2 =new ArrayList<String>();
ArrayList<String> List3 =new ArrayList<String>();
ArrayList<String> List4 =new ArrayList<String>();
ArrayList<String> List5 =new ArrayList<String>();
ArrayList<String> List6 =new ArrayList<String>();
ArrayList<String> List7 =new ArrayList<String>();



public MostCommonWords() {
	super();
	
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



/**
 * @return the text
 */
public String getText(int i) {
	return text.get(i);
}



/**
 * @param textPath the textPath to set
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



//create array list with stop words
public void createStopList() throws FileNotFoundException {
	Scanner s= new Scanner(new File(stopWordsPath));
	while (s.hasNext()) {
		stopWords.add(s.next());
	}
	s.close();
}
public int countWords() throws FileNotFoundException {

	
	int wordCount=0;
		return wordCount;
}
private void populatingLists() {
	
}
public void textToList(String text) throws FileNotFoundException {
	Scanner b= new Scanner(new File(text));
	int maxPerList=2461;
	int numOfLists=7;
	int currentList=1;
	int currentWord=1;
	int maxForThisList=currentList*maxPerList;
	
	while(b.hasNext()&& currentWord<maxPerList ) {
		String wordToAdd=b.next();	
		List1.add(wordToAdd.toLowerCase());
		currentWord++;
	}
	currentList++;
	while (b.hasNext()&& currentWord<maxForThisList) {
		String wordToAdd=b.next();
		List2.add(wordToAdd.toLowerCase());
		System.out.println(wordToAdd.toLowerCase()+" " +currentWord);
		currentWord++;
		
	}
	currentList++;
	while (b.hasNext()&& currentWord< maxForThisList) {
		String wordToAdd=b.next();
		List3.add(wordToAdd.toLowerCase());
		currentWord++;
	}
	currentList++;
	while(b.hasNext()&&currentWord<maxForThisList) {
		String wordToAdd=b.next();
		List4.add(wordToAdd.toLowerCase());
		currentWord++;
	}
	
}
public void removeStopWords() {
	
}
public void removePunctuation() {
	
}

public void order() {
	
}
}
