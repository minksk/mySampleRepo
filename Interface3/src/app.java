import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.List;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Text;

public class app {

	protected Shell shell;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			app window = new app();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(326, 377);
		shell.setText("Top 10 Words in Moby Dick");

		Label lblMostCommonWords = new Label(shell, SWT.NONE);
		lblMostCommonWords.setBounds(24, 10, 78, 15);
		lblMostCommonWords.setText("Top 10 Words");

		Label lblCountOfWord = new Label(shell, SWT.NONE);
		lblCountOfWord.setBounds(121, 10, 78, 15);
		lblCountOfWord.setText("Count of Word");

		ListViewer listViewer = new ListViewer(shell, SWT.BORDER | SWT.V_SCROLL);
		List commonWords = listViewer.getList();
		commonWords.setBounds(34, 42, 88, 187);

		ListViewer listViewer_1 = new ListViewer(shell, SWT.BORDER | SWT.V_SCROLL);
		List wordCount = listViewer_1.getList();
		wordCount.setEnabled(false);
		wordCount.setBounds(121, 42, 51, 187);

		Button btnCalculateMostCommonwords = formToolkit.createButton(shell, "Calculate Most Used Words for File",
				SWT.NONE);
		btnCalculateMostCommonwords.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				MostCommonWords2 run = new MostCommonWords2();
				Map.Entry<String, Integer> maxEntry = null;
				int topNum = 10;
				try {
					run.main();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				HashMap<String, Integer> f10 = run.getFinal10();

				Iterator it = f10.entrySet().iterator();

				Map.Entry pair = (Map.Entry) it.next();

				for (int i = 0; i < topNum; i++) {
					for (Map.Entry<String, Integer> entry : f10.entrySet()) {
						if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
							maxEntry = entry;

						}
					}

					commonWords.add(maxEntry.getKey().toString());
					wordCount.add(maxEntry.getValue().toString());
					f10.replace(maxEntry.getKey(), 0);
				}

				it.remove(); // avoids a ConcurrentModificationException

			}

		});
		btnCalculateMostCommonwords.setBounds(31, 277, 194, 25);

	}
}
