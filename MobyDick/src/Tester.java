import java.io.FileNotFoundException;

public class Tester {

	public static void main(String[] args) throws FileNotFoundException {
		MostCommonWords mcw=new MostCommonWords();
		mcw.createStopList();
		mcw.textToList();
		System.out.println("This will print");
		System.out.println(mcw.getStopWords(1));
		System.out.println("Print out: "+mcw.getText(0));

	}

}
