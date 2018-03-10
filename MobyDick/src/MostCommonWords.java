import java.io.File;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Scanner;
import org.junit.*;
public class MostCommonWords {
private String textPath="mobydick.txt";
private String stopWordsPath="stop-words.txt";
private ArrayList<String> text=new ArrayList<String>();
private ArrayList<String> stopWords=new ArrayList<String>();
private ArrayList<String> listOfLists= new ArrayList<String>();



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
public void textToList() throws FileNotFoundException {
	Scanner a= new Scanner(new File(textPath));
	int maxPerList=2461;
	int numOfLists=7;
	int currentList=1;
	int currentWord=1;
	ArrayList<String> List1 =new ArrayList<String>();
	ArrayList<String> List2 =new ArrayList<String>();
	ArrayList<String> List3 =new ArrayList<String>();
	ArrayList<String> List4 =new ArrayList<String>();
	ArrayList<String> List5 =new ArrayList<String>();
	ArrayList<String> List6 =new ArrayList<String>();
	ArrayList<String> List7 =new ArrayList<String>();
	while(a.hasNext()&& currentList<maxPerList ) {
		
	
		List1.add(a.next());
		currentWord++;
	}
	currentList++;
	int nextUpperLimit=maxPerList*currentList;
	
	while (a.hasNext() && currentWord<nextUpperLimit) {
		
		
	}
}

}
