import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;

public class Display {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Display window = new Display();
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

	private void sleep() {
		// TODO Auto-generated method stub
		
	}

	private boolean readAndDispatch() {
		// TODO Auto-generated method stub
		return false;
	}

	private static Display getDefault() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
	

	}

}
